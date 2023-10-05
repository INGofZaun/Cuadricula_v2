package com.example.cuadricula

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(@StringRes val name: Int,
                 val availableCourses: Int,
                 @DrawableRes val imageRes: Int)