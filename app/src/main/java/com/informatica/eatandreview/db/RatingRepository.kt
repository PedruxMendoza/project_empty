package com.informatica.eatandreview.db

class RatingRepository(private val dao: RatingDAO) {

    val rating = dao.getAllRating()

    suspend fun insert(rating: Rating): Long {
        return dao.insertRating(rating)
    }

    suspend fun update(rating: Rating): Int {
        return dao.updateRating(rating)
    }

    suspend fun delete(rating: Rating): Int {
        return dao.deleteRating(rating)
    }

    suspend fun deleteAll(): Int {
        return dao.deleteAll()
    }
}