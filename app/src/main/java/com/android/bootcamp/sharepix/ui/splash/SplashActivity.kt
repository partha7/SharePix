package com.android.bootcamp.sharepix.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import com.android.bootcamp.sharepix.R
import com.android.bootcamp.sharepix.di.component.ActivityComponent
import com.android.bootcamp.sharepix.ui.base.BaseActivity
import com.android.bootcamp.sharepix.ui.login.LoginActivity
import com.android.bootcamp.sharepix.ui.main.MainActivity
import com.android.bootcamp.sharepix.utils.common.Event

class SplashActivity : BaseActivity<SplashViewModel>() {

    companion object {
        const val TAG = "SplashActivity"
    }

    override fun provideLayoutId(): Int = R.layout.activity_splash

    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun setupView(savedInstanceState: Bundle?) {
    }

    override fun setupObservers() {
        super.setupObservers()
        // Event is used by the view model to tell the activity to launch another activity
        // view model also provided the Bundle in the event that is needed for the Activity
        viewModel.launchLogin.observe(this, Observer<Event<Map<String, String>>> {
            it.getIfNotHandled()?.run {
                startActivity(Intent(applicationContext, LoginActivity::class.java))
            }
        })

        viewModel.launchMain.observe(this, Observer<Event<Map<String, String>>> {
            it.getIfNotHandled()?.run {
                startActivity(Intent(applicationContext, MainActivity::class.java))
            }
        })
    }
}