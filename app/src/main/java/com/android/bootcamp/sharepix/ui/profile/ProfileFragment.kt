package com.android.bootcamp.sharepix.ui.profile

import android.os.Bundle
import android.view.View
import com.android.bootcamp.sharepix.R
import com.android.bootcamp.sharepix.di.component.FragmentComponent
import com.android.bootcamp.sharepix.ui.base.BaseFragment

class ProfileFragment : BaseFragment<ProfileViewModel>() {

    companion object {

        const val TAG = "ProfileFragment"

        fun newInstance(): ProfileFragment {
            val args = Bundle()
            val fragment = ProfileFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun provideLayoutId(): Int = R.layout.fragment_profile

    override fun injectDependencies(fragmentComponent: FragmentComponent) {
        fragmentComponent.inject(this)
    }

    override fun setupObservers() {
        super.setupObservers()

    }

    override fun setupView(view: View) {

    }

}