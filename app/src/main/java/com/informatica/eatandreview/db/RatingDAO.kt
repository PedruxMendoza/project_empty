package com.informatica.eatandreview.db

import androidx.room.Dao

@Dao
interface RatingDAO {

    @Insert
    suspend fun insertRating(rating: Rating) : Long

    @Update
    suspend fun updateRating(rating: Rating) : Int

    @Delete
    suspend fun deleteRating(rating: Rating) : Int

    @Query("DELETE FROM rating")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM rating")
    fun getAllSubscribers():Flow<List<Rating>>
}