package com.viewpagerteste

import androidx.annotation.DrawableRes

data class Welcome(
    val title: String,
    @DrawableRes val drawableId: Int,
    val desc: String
)
