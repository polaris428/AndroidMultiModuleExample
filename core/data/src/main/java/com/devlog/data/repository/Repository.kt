package com.devlog.data.repository

interface Repository {
    fun login(username: String, password: String): Boolean
}