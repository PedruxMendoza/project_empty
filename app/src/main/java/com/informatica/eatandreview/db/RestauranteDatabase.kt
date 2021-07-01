package com.informatica.eatandreview.db

import androidx.room.Database
import androidx.room.Volatile
import androidx.room.RoomDatabase
import androidx.room.Update
import androidx.room.Delete
import androidx.room.Query

@Database(entities = [Restaurante::class], version = 1)
abstract class RestauranteDatabase : RoomDatabase() {

    abstract val restauranteDAO: RestauranteDAO

    companion object {
        @Volatile
        private var INSTANCE: RestauranteDatabase? = null
        fun getInstance(context: Context): RestauranteDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            RestauranteDatabase::class.java,
                            "restaurante"
                    ).build()
                }
                return instance
            }
        }
}