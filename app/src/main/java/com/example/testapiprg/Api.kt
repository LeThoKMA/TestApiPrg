package com.example.testapiprg

import com.example.testapiprg.data.model.NationalResponse
import com.example.testapiprg.data.model.RegisterRequest
import com.example.testapiprg.data.model.Response
import com.example.testapiprg.data.model.User
import com.google.gson.GsonBuilder
import kotlinx.coroutines.flow.Flow
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.http.Url

interface Api {
    companion object {
        val gson = GsonBuilder().create()
        val api = Retrofit.Builder().baseUrl("https://dog.ceo/api/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build().create(Api::class.java)

        val apiN = Retrofit.Builder().baseUrl("https://api.nationalize.io/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build().create(Api::class.java)


    }

    @GET("breeds/image/random")
    suspend fun register(): Response?



    @GET
   suspend fun nationalA(@Url url:String="https://api.nationalize.io/?name=nathaniel"):NationalResponse?
}