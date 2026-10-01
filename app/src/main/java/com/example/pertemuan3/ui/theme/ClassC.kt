package com.example.pertemuan3

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun contohColumn(modifier: Modifier){
    Columns(modifier = modifier.padding(top = 20.dp, start=20.dp)) {
        Text("Malam wok")
        Text("Selamat Malam")
        Text("Saya sedang belajar")
    }
}

@Composable
fun contohRow(modifier: Modifier) {
    Row(modifier = modifier.padding(top=100.dp, start =100.dp)) {
        val kota = stringResource(id = R.string.kota)
        val univ = stringResource(id = R.string.univ)

        Text(kota, fontWeight = fontWeight.Bold, fontSize = 20.sp)
        Text("$univ")

    }
}

@Composable
fun contohGambar(modifier: Modifier)