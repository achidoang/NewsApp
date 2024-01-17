package com.dicoding.gymtoolkit.presentation.onboarding

import androidx.annotation.DrawableRes
import com.dicoding.gymtoolkit.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

// Data Onboarding
val pages = listOf(
    Page(
        title = "Stay Informed Anytime, Anywhere",
        description = "Welcome to NewsHub, your go-to app for the latest and most reliable news. Explore a world of information at your fingertips and stay connected with the stories that matter most to you.",
        image = R.drawable.onboarding4 //image onboarding
    ),

    Page(
        title = "Dive Into Unparalleled News Coverage",
        description = "NewsHub offers unlimited access to top-notch journalism, expert analysis, and a diverse range of news categories. Join a community of informed readers and make every moment an opportunity to discover and understand the world around you.",
        image = R.drawable.onboarding5 //image onboarding
    ),

    Page(
        title = "Smart Features for Your News Lifestyle",
        description = "Experience innovative features that let you customize your news feed, track real-time updates, and engage with stories that resonate with you. Embrace a new way of staying informed and welcome a healthier understanding of the world.",
        image = R.drawable.onboarding6 //image onboarding
    )

)