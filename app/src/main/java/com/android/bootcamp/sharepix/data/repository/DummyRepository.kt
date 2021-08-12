package com.android.bootcamp.sharepix.data.repository

import com.android.bootcamp.sharepix.data.local.db.DatabaseService
import com.android.bootcamp.sharepix.data.model.Dummy
import com.android.bootcamp.sharepix.data.remote.NetworkService
import com.android.bootcamp.sharepix.data.remote.request.DummyRequest
import io.reactivex.Single
import javax.inject.Inject

class DummyRepository @Inject constructor(
    private val networkService: NetworkService,
    private val databaseService: DatabaseService
) {

    fun fetchDummy(id: String): Single<List<Dummy>> =
        networkService.doDummyCall(DummyRequest(id)).map { it.data }

}