package com.dicoding.gymtoolkit.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.dicoding.gymtoolkit.presentation.bookmark.BookmarkScreen
import com.dicoding.gymtoolkit.presentation.bookmark.BookmarkViewModel
import com.dicoding.gymtoolkit.presentation.news_navigator.NewsNavigator
import com.dicoding.gymtoolkit.presentation.onboarding.OnBoardingScreen
import com.dicoding.gymtoolkit.presentation.onboarding.OnBoardingViewModel

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(route = Route.OnBoardingScreen.route) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(onEvent = viewModel::onEvent)
            }
        }

        navigation(
            route = Route.GymNavigation.route,
            startDestination = Route.GymNavigatorScreen.route
        ) {
            composable(route = Route.GymNavigatorScreen.route){
                NewsNavigator()
            }
        }
    }
}