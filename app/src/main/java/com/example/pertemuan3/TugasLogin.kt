package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(
    modifier: Modifier = Modifier

) {

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        // BACKGROUND

        Image(
            painter = painterResource(
                id = R.drawable.background_login
            ),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // KONTEN LOGIN

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Spacer(
                modifier = Modifier.size(65.dp)
            )

            // JUDUL LOGIN

            Text(
                text = "Login",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            // SUB JUDUL

            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.White
            )

            Spacer(
                modifier = Modifier.size(35.dp)
            )

            // LOGO UMY

            Image(
                painter = painterResource(
                    id = R.drawable.logo_umy
                ),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(145.dp),
                contentScale = ContentScale.Fit
            )


            Spacer(
                modifier = Modifier.size(35.dp)
            )

            // NAMA

            Text(
                text = "Nama",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Text(
                text = "Narendra Nabil Putra",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )