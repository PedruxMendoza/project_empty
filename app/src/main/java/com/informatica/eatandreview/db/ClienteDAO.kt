package com.informatica.eatandreview.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import androidx.room.Delete
import androidx.room.Query

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