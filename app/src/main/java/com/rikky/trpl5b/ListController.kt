package com.rikky.trpl5b

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitAPI {
    @GET("ba6bc89c5b2b550a996d")
    fun getLanguages(): Call<ArrayList<ListModal>>

}