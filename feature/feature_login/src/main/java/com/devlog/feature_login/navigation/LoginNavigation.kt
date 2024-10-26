package com.devlog.feature_login.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.devlog.feature_login.LoginScreen
import com.devlog.feature_login.LoginViewModel

fun NavController.navigateLogin() {
    navigate(LoginRoute.route)
}

fun NavGraphBuilder.loginNavGraph(
    onSignInClick: (Boolean) -> Unit
) {
    composable(route = LoginRoute.route) {
        LoginScreen(viewModel = LoginViewModel(), onSignInClick =onSignInClick)
    }
}

object LoginRoute {
    const val route = "login"
}