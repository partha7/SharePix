package com.android.bootcamp.sharepix.di.component

import com.android.bootcamp.sharepix.di.FragmentScope
import com.android.bootcamp.sharepix.di.module.FragmentModule
import com.android.bootcamp.sharepix.ui.dummies.DummiesFragment
import com.android.bootcamp.sharepix.ui.home.HomeFragment
import com.android.bootcamp.sharepix.ui.photo.PhotoFragment
import com.android.bootcamp.sharepix.ui.profile.ProfileFragment
import dagger.Component

@FragmentScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [FragmentModule::class]
)
interface FragmentComponent {

    fun inject(fragment: DummiesFragment)

    fun inject(fragment: ProfileFragment)

    fun inject(fragment: PhotoFragment)

    fun inject(fragment: HomeFragment)
}