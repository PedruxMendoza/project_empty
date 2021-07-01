package com.informatica.eatandreview.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(entity = Platillo::class,
        parentColumns = arrayOf("idplatillo"),
        childColumns = arrayOf("idplatillores"),
        onDelete = ForeignKey.CASCADE)
))
data class Restaurante(

    @ColumnInfo(name = "idrestaurante")
    @PrimaryKey(autoGenerate = true)
    val idRestaurante : Int,

    @ColumnInfo(name="nombrerestaurante")
    val nombreRestaurante: String,

    @ColumnInfo(name="direccion")
    val Direccion : String,

    @ColumnInfo(name="idplatillores")
    val idPlatilloRes : Int,

)