package com.informatica.eatandreview.db

import androidx.room.Dao

@Dao
interface ClienteDAO {

    @Insert
    suspend fun insertCliente(cliente: Cliente) : Long

    @Update
    suspend fun updateCliente(cliente: Cliente) : Int

    @Delete
    suspend fun deleteCliente(cliente: Cliente) : Int

    @Query("DELETE FROM cliente")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM cliente")
    fun getAllSubscribers():Flow<List<Cliente>>
}