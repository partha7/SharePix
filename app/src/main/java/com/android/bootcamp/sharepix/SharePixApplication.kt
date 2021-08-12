package com.android.bootcamp.sharepix

import android.app.Application
import com.android.bootcamp.sharepix.di.component.ApplicationComponent
import com.android.bootcamp.sharepix.di.component.DaggerApplicationComponent
import com.android.bootcamp.sharepix.di.module.ApplicationModule

class SharePixApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injectDependencies()
    }

    private fun injectDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)
    }

    // Needed to replace the component with a test specific one
    fun setComponent(applicationComponent: ApplicationComponent) {
        this.applicationComponent = applicationComponent
    }
}