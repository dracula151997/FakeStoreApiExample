package com.dracula.fakestoreapiexample

import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance{
	private val loggingInterceptor = HttpLoggingInterceptor().apply {
		level = HttpLoggingInterceptor.Level.BODY
	}
	private val client = okhttp3.OkHttpClient.Builder()
		.addInterceptor(loggingInterceptor)
		.build()
	private val retrofit by lazy {
		Retrofit.Builder()
			.baseUrl(BASE_URL)
			.addConverterFactory(GsonConverterFactory.create())
			.client(client)
			.build()
	}

	val api: ProductEndPoint by lazy {
		retrofit.create(ProductEndPoint::class.java)
	}
}