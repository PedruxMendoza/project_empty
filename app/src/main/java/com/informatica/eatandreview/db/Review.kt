package com.informatica.eatandreview.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Serializable

@Entity(tableName = "review")
data class Review (

    @SerializedName("idreview")
    @PrimaryKey(autoGenerate = true)
    val idReview : Int,

    @ColumnInfo(name="idcliente")
    val idCliente : Int,

    @ColumnInfo(name="comentario")
    val Comentario : String,

    @ColumnInfo(name="calificacion")
    val Calificacion : Int,

    @ColumnInfo(name="idrestaurante")
    val idRestaurante : Int

    )