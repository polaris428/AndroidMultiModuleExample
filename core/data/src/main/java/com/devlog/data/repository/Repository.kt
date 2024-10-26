package com.devlog.data.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


interface Repository {

    fun login(username: String, password: String): Boolean
}