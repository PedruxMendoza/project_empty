package com.informatica.eatandreview.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Rating::class], version = 1)
abstract class RatingDatabase : RoomDatabase() {

    abstract val ratingDAO: RatingDAO

    companion object {
        @Volatile
        private var INSTANCE: RatingDatabase? = null
        fun getInstance(context: Context): RatingDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            RatingDatabase::class.java,
                            "rating"
                    ).build()
                }
                return instance
            }
        }
}