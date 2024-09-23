package com.dracula.fakestoreapiexample.ui

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.dracula.fakestoreapiexample.ProductScreen


//NavGraph
// product/{category}
@Composable
fun CategoriesRoot(
	viewModel: CategoriesViewModel = viewModel(),
	navController: NavController,
) {
	val state = viewModel.state.value
	CategoriesScreen(
		state = state,
		onCategoryClick = {
			navController.navigate(ProductScreen(category = it))
		},
	)
}

@Composable
fun CategoriesScreen(
	state: CategoriesState,
	onCategoryClick: (String) -> Unit,
) {
	LazyColumn {
		items(state.categories) { category ->
			Text(
				text = category,
				modifier = Modifier
					.fillMaxWidth()
					.clickable {
						onCategoryClick(category)
					}
			)
		}
	}
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCategoriesScreen() {
	CategoriesScreen(
		state = CategoriesState(
			categories = listOf(
				"Electronics",
				"Jewel",
			)
		),
		onCategoryClick = {
			Log.d("PreviewCategoriesScreen", "Category clicked: $it")
		}
	)
}