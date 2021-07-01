package com.informatica.eatandreview.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import androidx.room.Delete
import androidx.room.Query

@Dao
interface RestauranteDAO {

    @Insert
    suspend fun insertRestaurante(restaurante: Restaurante) : Long

    @Update
    suspend fun updateRestaurante(restaurante: Restaurante) : Int

    @Delete
    suspend fun deleteRestaurante(restaurante: Restaurante) : Int

    @Query("DELETE FROM restaurante")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM restaurante")
    fun getAllSubscribers():Flow<List<Restaurante>>
}