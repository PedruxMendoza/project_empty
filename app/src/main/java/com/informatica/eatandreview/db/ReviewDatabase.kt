package com.informatica.eatandreview.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Review::class], version = 1)
abstract class ReviewDatabase : RoomDatabase() {

    abstract val reviewDAO: ReviewDAO

    companion object {
        @Volatile
        private var INSTANCE: ReviewDatabase? = null
        fun getInstance(context: Context): ReviewDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            ReviewDatabase::class.java,
                            "review"
                    ).build()
                }
                return instance
            }
        }
}