package com.PabloJesusHurtadoHidalgo.examenEJ1.listaVideojuegos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
object oListaVideojuegos{
    fun getListaVideojuegos(): List<Videojuego> =listaVideojuegos
}




val listaVideojuegos=(1..10).map {
    Videojuego(
        name="Videojuego $it",
        price=40+it,
        imageUrl="https://loremflickr.com/400/400/seville?lock=$it,"
    )
}



