package com.PabloJesusHurtadoHidalgo.examenEJ1.ui.listaScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.AsyncImage
import com.PabloJesusHurtadoHidalgo.examenEJ1.listaVideojuegos.Videojuego
import com.PabloJesusHurtadoHidalgo.examenEJ1.listaVideojuegos.oListaVideojuegos


@Composable
fun ListaScreen(){
    val listaVideojuegos= oListaVideojuegos.getListaVideojuegos()
    LazyColumn {
        items(listaVideojuegos){
            videojuego -> VideojuegoItem(videojuego=videojuego)
        }
    }
}

@Composable
fun VideojuegoItem(videojuego: Videojuego){
    Card(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ){
        Row {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                //AsyncImage(imageLoader = ImageLoader(videojuego.imageUrl)
                Text(text=videojuego.name)
                Spacer(modifier = Modifier.padding(8.dp))
                Text(text=videojuego.price.toString())
            }
        }
    }
}