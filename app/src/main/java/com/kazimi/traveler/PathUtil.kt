package com.kazimi.traveler

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import kotlin.math.abs

/**
 * Created by Ahmad Kazimi on 27.04.2022
 */

fun Path.standardQuadFromTo(from: Offset, to: Offset) {

    quadraticBezierTo(
        from.x,
        to.y,
        abs(from.x + to.x).div(2),
        abs(from.y + to.y).div(2),
    )
}