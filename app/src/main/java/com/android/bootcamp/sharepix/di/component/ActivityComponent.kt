package com.android.bootcamp.sharepix.di.component

import com.android.bootcamp.sharepix.di.ActivityScope
import com.android.bootcamp.sharepix.di.module.ActivityModule
import com.android.bootcamp.sharepix.ui.dummy.DummyActivity
import com.android.bootcamp.sharepix.ui.login.LoginActivity
import com.android.bootcamp.sharepix.ui.main.MainActivity
import com.android.bootcamp.sharepix.ui.splash.SplashActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: SplashActivity)

    fun inject(activity: LoginActivity)

    fun inject(activity: DummyActivity)

    fun inject(activity: MainActivity)
}