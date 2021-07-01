package com.informatica.eatandreview.db

class ReviewRepository(private val dao: ReviewDAO) {

    val review = dao.getAllReview()

    suspend fun insert(review: Review): Long {
        return dao.insertReview(review)
    }

    suspend fun update(review: Review): Int {
        return dao.updateReview(review)
    }

    suspend fun delete(review: Review): Int {
        return dao.deleteReview(review)
    }

    suspend fun deleteAll(): Int {
        return dao.deleteAll()
    }
}