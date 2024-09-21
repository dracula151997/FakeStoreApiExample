package com.dracula.fakestoreapiexample

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductRepository {
	private val api = RetrofitInstance.api

	suspend fun getProducts(): List<ProductResponse> = withContext(Dispatchers.IO){
		val response = api.getProducts()
		response
	}
}