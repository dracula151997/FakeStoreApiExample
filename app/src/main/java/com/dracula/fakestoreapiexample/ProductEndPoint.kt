package com.dracula.fakestoreapiexample

import retrofit2.http.GET
import retrofit2.http.Path

interface ProductEndPoint {
	@GET("products")
	suspend fun getProducts(): List<ProductResponse>

	@GET("products/categories")
	suspend fun getCategories(): List<String>

	@GET("products/category/{category}")
	suspend fun getProductsForCategory(@Path("category") category: String): List<ProductResponse>
}

