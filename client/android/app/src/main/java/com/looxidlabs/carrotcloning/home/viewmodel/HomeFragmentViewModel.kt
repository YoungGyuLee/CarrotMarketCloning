package com.looxidlabs.carrotcloning.home.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.looxidlabs.carrotcloning.home.data.HomeFragmentData
import com.looxidlabs.carrotcloning.home.repository.HomeFragmentRepository


//ViewModel is some kind of remote controller that used by Activity or Fragment
class HomeFragmentViewModel(application : Application) : AndroidViewModel(application) {
    private val repository = HomeFragmentRepository(application)
    private val items = repository.getAll()

    fun getAll(): LiveData<List<HomeFragmentData>>? {
        return this.items
    }

    fun insert(homeFragmentData: HomeFragmentData) {
        repository.insert(homeFragmentData)
    }

    fun delete(homeFragmentData: HomeFragmentData) {
        repository.delete(homeFragmentData)
    }
}