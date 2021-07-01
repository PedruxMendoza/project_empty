package com.informatica.eatandreview.db

class PlatilloRepository(private val dao: PlatilloDAO) {

    val platillo = dao.getAllPlatillo()

    suspend fun insert(platillo: Platillo): Long {
        return dao.insertPlatillo(platillo)
    }

    suspend fun update(platillo: Platillo): Int {
        return dao.updatePlatillo(platillo)
    }

    suspend fun delete(platillo: Platillo): Int {
        return dao.deletePlatillo(platillo)
    }

    suspend fun deleteAll(): Int {
        return dao.deleteAll()
    }
}