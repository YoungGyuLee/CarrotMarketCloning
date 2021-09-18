package com.looxidlabs.carrotcloning.home.data

import android.arch.persistence.room.*
import androidx.lifecycle.LiveData

//This interface is for writing SQL
@Dao
interface HomeFragmentDAO {

    @Query("SELECT * FROM HomeFragmentItemData ORDER BY location ASC")
    fun getAll() : LiveData<List<HomeFragmentData>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    //If the data that is same as a data in the table, replace the origin data to new data
    fun insert(homeFragmentData: HomeFragmentData)

    @Delete
    fun delete(homeFragmentData: HomeFragmentData)
}