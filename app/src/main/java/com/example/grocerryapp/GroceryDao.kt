package com.example.grocerryapp


import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface GroceryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItems)

    @Delete
    suspend fun delete(item : GroceryItems)

    @Query("SELECT * FROM grocery_items")
    fun gwtAllGroceryItem() : LiveData<List<GroceryItems>>

}