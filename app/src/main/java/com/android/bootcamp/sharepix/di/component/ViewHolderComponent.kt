package com.android.bootcamp.sharepix.di.component

import com.android.bootcamp.sharepix.di.ViewModelScope
import com.android.bootcamp.sharepix.di.module.ViewHolderModule
import com.android.bootcamp.sharepix.ui.dummies.DummyItemViewHolder
import com.android.bootcamp.sharepix.ui.home.posts.PostItemViewHolder
import dagger.Component

@ViewModelScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ViewHolderModule::class]
)
interface ViewHolderComponent {

    fun inject(viewHolder: DummyItemViewHolder)

    fun inject(viewHolder: PostItemViewHolder)
}