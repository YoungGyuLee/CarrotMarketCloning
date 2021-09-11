package com.looxidlabs.carrotcloning.home.ui

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.looxidlabs.carrotcloning.R
import com.looxidlabs.carrotcloning.home.data.HomeFragmentData
import com.looxidlabs.carrotcloning.home.viewmodel.HomeFragmentViewModel

class HomeFragment : Fragment() {

    lateinit var homeFragmentViewModel : HomeFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        homeFragmentViewModel = ViewModelProviders.of(this.activity).get(HomeFragmentViewModel::class.java)
//        homeFragmentViewModel.getAll()?.observe(this, Observer<List<HomeFragmentData>> { homeFragmentData ->
//            // Update UI
//        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onStart() {
        super.onStart()

    }

}