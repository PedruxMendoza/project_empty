package com.informatica.eatandreview.db

import androidx.room.Dao

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