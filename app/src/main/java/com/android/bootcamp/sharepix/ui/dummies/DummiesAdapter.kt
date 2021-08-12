package com.android.bootcamp.sharepix.ui.dummies

import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.android.bootcamp.sharepix.data.model.Dummy
import com.android.bootcamp.sharepix.ui.base.BaseAdapter

class DummiesAdapter(
    parentLifecycle: Lifecycle,
    private val dummies: ArrayList<Dummy>
) : BaseAdapter<Dummy, DummyItemViewHolder>(parentLifecycle, dummies) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DummyItemViewHolder(parent)
}