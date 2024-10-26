package com.devlog.feature_main.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.devlog.feature_login.navigation.LoginRoute
import com.devlog.feature_main.MainScreen

fun NavController.navigateMain() {
    navigate(MainRoute.route)
}

fun NavGraphBuilder.mainNavGraph(
    onLoginClick: (Int) -> Unit
) {
    composable(route = MainRoute.route) {
        MainScreen()
    }
}

object MainRoute {
    const val route = "main"
}