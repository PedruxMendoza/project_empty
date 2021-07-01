package com.informatica.eatandreview.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cliente")
data class Cliente (

        @ColumnInfo(name = "idcliente")
        @PrimaryKey(autoGenerate = true)
        val idCliente : Int,

        @ColumnInfo(name="nombrecliente")
        val nombreCliente : String,

        @ColumnInfo(name="email")
        val email : String,

        @ColumnInfo(name="usuario")
        val usuario: String,

        @ColumnInfo(name="pass")
        val pass: String


)
