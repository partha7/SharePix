package com.android.bootcamp.sharepix.di.component

import com.android.bootcamp.sharepix.di.module.ApplicationTestModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationTestModule::class])
interface TestComponent : ApplicationComponent {
}