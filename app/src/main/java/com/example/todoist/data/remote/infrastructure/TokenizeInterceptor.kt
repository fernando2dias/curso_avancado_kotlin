package com.example.todoist.data.remote.infrastructure

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

class TokenizeInterceptor @Inject constructor() : Interceptor {

    companion object {
        private const val API_TEST_TOKEN = "9d4670c96949d241cf6f796346f89e85c8342b08"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val newRequest: Request = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer $API_TEST_TOKEN")
            .build()
        return chain.proceed(newRequest)
    }
}