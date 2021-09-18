package com.looxidlabs.carrotcloning.home.repository

import android.app.Application

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import com.looxidlabs.carrotcloning.home.data.HomeFragmentData
import com.looxidlabs.carrotcloning.home.data.HomeFragmentDatabase
import java.lang.Exception


//repository : mediate between ViewModel and Data(DAO, Database...)
//repository is in the Model. Meanwhile ViewModel doesn't access the database.
//So it needs something to access and control database. That is repository

//In short, deliver the View Model's command to database
class HomeFragmentRepository(application: Application) {

    private val homeFragmentItemDatabase = HomeFragmentDatabase.getInstance(application)
    private val homeFragmentDAO = homeFragmentItemDatabase?.homeFragmentItemDAO()
    private val homeFragmentData : LiveData<List<HomeFragmentData>>? = homeFragmentDAO?.getAll()

    fun getAll() : LiveData<List<HomeFragmentData>>?{
        return homeFragmentData
    }

    fun insert(homeFragmentData : HomeFragmentData){
        try {
            //To prevent crash, use thread
            val thread = Thread(Runnable{
                //Repository : "Hey data! View Model said insert the given HomeFragmentData to DB
                homeFragmentDAO?.insert(homeFragmentData)
            })
            thread.start()
        }catch (e : Exception){

        }
    }

    fun delete(homeFragmentData: HomeFragmentData){
        try {
            val thread = Thread(Runnable{
                //Repository : "Hey data! View Model said delete the given HomeFragmentData to DB
                homeFragmentDAO?.delete(homeFragmentData)
            })
            thread.start()
        }catch (e : Exception){

        }
    }

}