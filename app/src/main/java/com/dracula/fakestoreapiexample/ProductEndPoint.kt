package com.dracula.fakestoreapiexample

import retrofit2.http.GET

interface ProductEndPoint {
	@GET("products")
	suspend fun getProducts(): List<ProductResponse>
	@GET("products/categories")
	suspend fun getCategories(): List<String>
}

