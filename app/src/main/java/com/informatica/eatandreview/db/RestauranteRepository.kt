package com.informatica.eatandreview.db

class RestauranteRepository(private val dao: RestauranteDAO) {

    val restaurante = dao.getAllRestaurante()

    suspend fun insert(resturante: Restaurante): Long {
        return dao.insertRestaurante(resturante)
    }

    suspend fun update(resturante: Restaurante): Int {
        return dao.updateRestaurante(resturante)
    }

    suspend fun delete(resturante: Restaurante): Int {
        return dao.deleteRestaurante(resturante)
    }

    suspend fun deleteAll(): Int {
        return dao.deleteAll()
    }
}