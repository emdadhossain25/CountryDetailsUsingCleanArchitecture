package com.example.countrydetailsusingcleanarchitecture.data.network

import com.example.countrydetailsusingcleanarchitecture.data.model.CountryDTO
import com.example.countrydetailsusingcleanarchitecture.data.model.CountryDetailsDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {


    @GET("/all")
    suspend fun getCountryList(): List<CountryDTO>

    @GET("/name/{country_name}")
    suspend fun getCountryListDetails(
        @Path("country_name") countryName:String,
        @Query("format") format:String="json"
    ): List<CountryDetailsDTO>
}