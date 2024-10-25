package com.devlog.data.repository

class RepositoryImpl : Repository {
    override fun login(username: String, password: String): Boolean {
        return username == "test" && password == "test"
    }
}