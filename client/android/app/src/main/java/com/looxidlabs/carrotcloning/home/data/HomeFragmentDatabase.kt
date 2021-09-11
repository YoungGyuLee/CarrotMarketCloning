package com.looxidlabs.carrotcloning.home.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

//using other classes in the data package, create and edit the database
@Database(entities = [HomeFragmentData::class], version = 1)
abstract class HomeFragmentDatabase : RoomDatabase() {
    abstract fun homeFragmentItemDAO() : HomeFragmentDAO

    companion object{
        private var dbInstance : HomeFragmentDatabase? = null

        fun getInstance(context : Context) : HomeFragmentDatabase?{
            if(dbInstance == null){
                synchronized(HomeFragmentDatabase::class){
                    dbInstance = Room.databaseBuilder(context.applicationContext,
                    HomeFragmentDatabase::class.java, "HomeFragmentItemData")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return dbInstance
        }

    }
}