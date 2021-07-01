package com.informatica.eatandreview.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Cliente::class], version = 1)
abstract class ClienteDatabase : RoomDatabase() {

    abstract val clienteDAO: ClienteDAO

    companion object {
        @Volatile
        private var INSTANCE: ClienteDatabase? = null
        fun getInstance(context: Context): ClienteDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            ClienteDatabase::class.java,
                            "cliente"
                    ).build()
                }
                return instance
            }
        }
}