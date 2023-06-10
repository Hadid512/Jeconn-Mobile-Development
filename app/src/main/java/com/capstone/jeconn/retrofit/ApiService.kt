package com.capstone.jeconn.retrofit

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path


interface ApiService {
    @PUT("publicData/updateProfileUser/{username}")
    @Multipart
    fun updateProfileImage(
        @Path("username") username: String,
        @Part file: MultipartBody.Part
    ): Call<Unit>

    @POST("publicData/{username}/jobInformation/imagesUrl")
    @Multipart
    fun postJobImage(
        @Path("username") username: String,
        @Part file: MultipartBody.Part
    ): Call<Unit>
}