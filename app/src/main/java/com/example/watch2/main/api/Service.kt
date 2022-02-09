package com.example.watch2.main.api

import com.example.watch2.login.model.ModelInto
import okhttp3.Response
import retrofit2.http.*

interface Service {

    @POST("auth/login")
    suspend fun lohIn(@Body model: ModelInto): Response

    @GET("name")
    suspend fun getPhotos(@Query("name") name: String)

    @GET("user/chats")
    suspend fun getChat()
}