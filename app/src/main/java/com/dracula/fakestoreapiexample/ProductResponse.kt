package com.dracula.fakestoreapiexample


data class ProductResponse(
	val id: Int,
	val title: String,
	val price: Double,
	val category: String,
	val description: String,
	val image: String,
	val rating: Rating
)

data class Rating(
	val rate: Double,
	val count: Int,
)