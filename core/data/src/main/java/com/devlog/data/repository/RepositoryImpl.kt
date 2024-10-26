package com.devlog.data.repository

import javax.inject.Inject

class RepositoryImpl   @Inject constructor(): Repository {
    override fun login(username: String, password: String): Boolean {
        return username == "test" && password == "test"
    }
}