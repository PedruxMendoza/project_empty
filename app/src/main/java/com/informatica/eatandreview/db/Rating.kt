package com.informatica.eatandreview.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rating")
data class Rating (

    @ColumnInfo("idrating")
    @PrimaryKey(autoGenerate = true)
    val idRating : Int,

    @ColumnInfo(name="estrella")
    val Estrella: Int

)