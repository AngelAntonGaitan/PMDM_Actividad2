package com.example.actividad2pmdm

import com.example.actividad2pmdm.model.SeriesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface SeriesApiService {

    @GET
    suspend fun getAllSeries(@Url url : String): Response<SeriesResponse>

}
