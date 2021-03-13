/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R

val montserratExtraBold = FontFamily(
    Font(R.font.montserrat_extra_bold)
)
val montserratSemiBold = FontFamily(
    Font(R.font.montserrat_semi_bold)
)
val montserratMedium = FontFamily(
    Font(R.font.montserrat_semi_bold_font)
)
val montserratLight = FontFamily(
    Font(R.font.montserrat_light_font)
)
val montserratBold = FontFamily(
    Font(R.font.montserrat_bold_font)
)
// Set of Material typography styles to start with
val typography = Typography(
    h1 = TextStyle(
        fontWeight = FontWeight.ExtraBold,
        fontSize = 40.sp,
        letterSpacing = 1.5.sp,
        fontFamily = montserratExtraBold
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 36.sp,
        letterSpacing = 0.sp,
        fontFamily = montserratExtraBold
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 13.sp,
        letterSpacing = 0.sp,
        fontFamily = montserratSemiBold
    ),
    subtitle1 = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp,
        letterSpacing = 0.sp,
        fontFamily = montserratMedium
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        fontFamily = montserratLight
    ),
    button = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 13.sp,
        fontFamily = montserratBold
    ),
)
