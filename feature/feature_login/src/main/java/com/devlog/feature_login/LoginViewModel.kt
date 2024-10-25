package com.devlog.feature_login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.devlog.data.repository.RepositoryImpl
import com.devlog.domain.usecase.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel


class LoginViewModel() : ViewModel() {

    var username by mutableStateOf("")
    var password by mutableStateOf("")

    // Core 모듈의 UseCase 사용
    private val loginUseCase = LoginUseCase(RepositoryImpl())

    fun onLoginClick():Boolean {
        val isLoggedIn = loginUseCase.login(username, password)
        if (isLoggedIn) {
            println("로그인 성공")
        } else {
            println("로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다.")
        }
        return isLoggedIn
    }
}