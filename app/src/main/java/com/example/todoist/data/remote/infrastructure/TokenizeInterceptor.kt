package com.example.todoist.data.remote.infrastructure

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class TokenizeInterceptor @Inject constructor() : Interceptor {


    companion object {
        private const val API_TEST_TOKEN = "d320d7755d7f4cf51623f139ebc3d39aff7ebc6b"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val newRequest: Request = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer $API_TEST_TOKEN")
            .build()
        return chain.proceed(newRequest)
    }


}