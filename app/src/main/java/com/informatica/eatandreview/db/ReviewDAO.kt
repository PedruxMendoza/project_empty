package com.informatica.eatandreview.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import androidx.room.Delete
import androidx.room.Query

@Dao
interface ReviewDAO {

    @Insert
    suspend fun insertReview(review: Review) : Long

    @Update
    suspend fun updateReview(review: Review) : Int

    @Delete
    suspend fun deleteReview(review: Review) : Int

    @Query("DELETE FROM review")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM review")
    fun getAllSubscribers():Flow<List<Review>>
}