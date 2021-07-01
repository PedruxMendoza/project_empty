package com.informatica.eatandreview.db

import androidx.room.Dao

@Dao
interface PlatilloDAO {

    @Insert
    suspend fun insertPlatillo(platillo: Platillo) : Long

    @Update
    suspend fun updatePlatillo(platillo: Platillo) : Int

    @Delete
    suspend fun deletePlatillo(platillo: Platillo) : Int

    @Query("DELETE FROM platillo")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM platillo")
    fun getAllSubscribers():Flow<List<Platillo>>
}