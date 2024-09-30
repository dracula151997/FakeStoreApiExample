package com.dracula.fakestoreapiexample

import kotlinx.serialization.Serializable

@Serializable
data class ProductScreen(
	val category: String
)

@Serializable
object CategoryScreen