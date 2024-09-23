package com.dracula.fakestoreapiexample

import android.util.Log

class ProductRepository {
	// TODO: Initialize the Retrofit API instance
	private val api = RetrofitInstance.api
	// TODO: Create a suspend function to fetch products from the API
	suspend fun getProducts(): List<ProductResponse> {
		// TODO: Make the API call to get products
		return try {
			val response = api.getProducts()
			// TODO: Return the response
			response
		}
		catch (e: Exception){
			Log.d("ProductRepository","the error message is : ${e.message} ")
			emptyList()
		}
		}
	suspend fun getCategories(): List<String>{
		return try {
		    val responseCategories = api.getCategories()
			return responseCategories
		}catch (e: Exception){
			emptyList()
		}
	}



}