package com.example.jetpackcomposefontgoogletextstyle.TextPage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposefontgoogletextstyle.R
import com.example.jetpackcomposefontgoogletextstyle.ui.theme.ColorGunmetal
import com.example.jetpackcomposefontgoogletextstyle.ui.theme.cairoPlatinumSemiBold25
import com.example.jetpackcomposefontgoogletextstyle.ui.theme.ibarraPlatinumBold25
import com.example.jetpackcomposefontgoogletextstyle.ui.theme.mrsPlatinumNormal25
import org.w3c.dom.Text


@Composable
fun TextPage() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = ColorGunmetal)
    ) {

        Text(text = stringResource(id = R.string.test_Bilal_cairo),
            style = cairoPlatinumSemiBold25 )

        Spacer(modifier = Modifier.height(15.dp))


        Text(text = stringResource(id = R.string.test_Bilal_ibarra),
            style = ibarraPlatinumBold25)
        Spacer(modifier = Modifier.height(15.dp))


        Text(text = stringResource(id = R.string.test_Bilal_mrs),
            style = mrsPlatinumNormal25)
    }
}
@Composable
@Preview
fun TextPagePreview() {
    TextPage()
}