package com.dracula.fakestoreapiexample.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun CategoriesRoot(
    viewModel: CategoriesViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
){
     val state = viewModel.state.value
}
@Composable
fun CategoriesScreen (
    state: CategoriesState
)
{
    Card (
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(8.dp)

    ){
        Column {
            
        }
    }

}