package com.example.jetpackcomposefontgoogletextstyle.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposefontgoogletextstyle.R

//اضافة الخطوط
val CairoFont = FontFamily(
    Font(R.font.cairo_regular),
    Font(R.font.cairo_semi_bold, weight = FontWeight.Bold), //خط غامق
)

val IbarraFont = FontFamily(
    Font(R.font.ibarra_real_nova_regular),
    Font(R.font.ibarra_real_nova_bold, weight = FontWeight.Bold),
)

val MrsFont = FontFamily(
    Font(R.font.mrs_saint_delafield_regular)
)


val cairoPlatinumSemiBold25 = TextStyle(

    fontFamily = CairoFont,
    color = ColorPlatinum,
    fontWeight = FontWeight.SemiBold,
    fontSize = 25.sp

)

val ibarraPlatinumBold25 =  TextStyle(

    fontFamily = IbarraFont,
    color = ColorPlatinum,
    fontWeight = FontWeight.Bold,
    fontSize = 25.sp
)

val mrsPlatinumNormal25 = TextStyle(
    fontFamily = MrsFont,
    color = ColorPlatinum,
    fontSize = 25.sp
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)