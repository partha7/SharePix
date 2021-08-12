package com.android.bootcamp.sharepix.di.module

import androidx.lifecycle.LifecycleRegistry
import com.android.bootcamp.sharepix.di.ViewModelScope
import com.android.bootcamp.sharepix.ui.base.BaseItemViewHolder
import dagger.Module
import dagger.Provides

@Module
class ViewHolderModule(private val viewHolder: BaseItemViewHolder<*, *>) {

    @Provides
    @ViewModelScope
    fun provideLifecycleRegistry(): LifecycleRegistry = LifecycleRegistry(viewHolder)
}