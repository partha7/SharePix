package com.android.bootcamp.sharepix.ui.dummies

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.android.bootcamp.sharepix.data.model.Dummy
import com.android.bootcamp.sharepix.data.repository.DummyRepository
import com.android.bootcamp.sharepix.ui.base.BaseViewModel
import com.android.bootcamp.sharepix.utils.common.Resource
import com.android.bootcamp.sharepix.utils.common.Status
import com.android.bootcamp.sharepix.utils.network.NetworkHelper
import com.android.bootcamp.sharepix.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable


class DummiesViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper,
    private val dummyRepository: DummyRepository
) : BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {

    private val dummyLiveData: MutableLiveData<Resource<List<Dummy>>> = MutableLiveData()

    fun getDummies(): LiveData<List<Dummy>> =
        Transformations.map(dummyLiveData) { it.data }

    fun isDummiesFetching(): LiveData<Boolean> =
        Transformations.map(dummyLiveData) { it.status == Status.LOADING }

    override fun onCreate() {
        if (dummyLiveData.value == null && checkInternetConnectionWithMessage()) {
            dummyLiveData.postValue(Resource.loading())
            compositeDisposable.add(
                dummyRepository.fetchDummy("MY_SAMPLE_DUMMY")
                    .subscribeOn(schedulerProvider.io())
                    .subscribe(
                        { dummyLiveData.postValue(Resource.success(it)) },
                        {
                            handleNetworkError(it)
                            dummyLiveData.postValue(Resource.error())
                        })
            )
        }
    }
}