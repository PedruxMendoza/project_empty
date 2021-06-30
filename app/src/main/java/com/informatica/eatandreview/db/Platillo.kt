package com.informatica.eatandreview.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(entity = Rating::class,
        parentColumns = arrayOf("idrating"),
        childColumns = arrayOf("idratingpla"),
        onDelete = ForeignKey.CASCADE)))
data class Platillo (

    @ColumnInfo("idplatillo")
    @PrimaryKey(autoGenerate = true)
    val idPlatillo : Int,

    @ColumnInfo(name="nombreplatillo")
    val nombrePlatillo : String,

    @ColumnInfo(name="idratingpla")
    val idRatingPla : Int,

    @ColumnInfo(name="descripcion")
    val Descripcion : String,


)