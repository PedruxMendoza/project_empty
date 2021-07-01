package com.informatica.eatandreview.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Platillo::class], version = 1)
abstract class PlatilloDatabase : RoomDatabase() {

    abstract val platilloDAO: PlatilloDAO

    companion object {
        @Volatile
        private var INSTANCE: PlatilloDatabase? = null
        fun getInstance(context: Context): PlatilloDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            PlatilloDatabase::class.java,
                            "platillo"
                    ).build()
                }
                return instance
            }
        }
}