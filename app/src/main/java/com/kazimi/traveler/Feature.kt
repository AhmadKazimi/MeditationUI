package com.kazimi.traveler

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by Ahmad Kazimi on 27.04.2022
 */
data class Feature(
    val title: String,
    @DrawableRes val icon: Int,
    val color: Color,
    val lightColor: Color,
    val darkColor: Color,
)
