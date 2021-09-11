package com.looxidlabs.carrotcloning.home.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "HomeFragmentItemData")//if tableName is same as the class name, you can skip the name.
data class HomeFragmentData (
    @PrimaryKey(autoGenerate = true)
    var id : Int,

    @ColumnInfo(name = "thumbnail")
    var thumbnail : Int,

    @ColumnInfo(name = "title")
    var title : String,

    @ColumnInfo(name = "location")
    var location : String,

    @ColumnInfo(name = "price")
    var price : String
    )

//Data class for Entity