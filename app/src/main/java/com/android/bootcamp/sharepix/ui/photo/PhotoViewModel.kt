package com.android.bootcamp.sharepix.ui.photo

import com.android.bootcamp.sharepix.ui.base.BaseViewModel
import com.android.bootcamp.sharepix.utils.network.NetworkHelper
import com.android.bootcamp.sharepix.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

class PhotoViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper
) : BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {


    override fun onCreate() {

    }
}