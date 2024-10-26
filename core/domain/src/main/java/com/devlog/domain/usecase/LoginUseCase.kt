package com.devlog.domain.usecase

import com.devlog.data.repository.Repository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: Repository
) {

    fun login(username: String, password: String): Boolean {
        return repository.login(username, password)
    }
}