package com.informatica.eatandreview.db

class ClienteRepository(private val dao: ClienteDAO) {

    val cliente = dao.getAllCliente()

    suspend fun insert(cliente: Cliente): Long {
        return dao.insertCliente(cliente)
    }

    suspend fun update(cliente: Cliente): Int {
        return dao.updateCliente(cliente)
    }

    suspend fun delete(cliente: Cliente): Int {
        return dao.deleteCliente(cliente)
    }

    suspend fun deleteAll(): Int {
        return dao.deleteAll()
    }
}