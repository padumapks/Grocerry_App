package com.example.grocerryapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "grocerry_items")
data class GroceryItems (

    @ColumnInfo(name = "itemname")
    var itemName: String,

    @ColumnInfo(name = "itemQuantity")
    var itemQuantity:Int,

    @ColumnInfo(name = "itemPrice")
    var itemPrice: Int,
        ){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}