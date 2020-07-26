package com.example.covid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface countriesInterface {
   @GET("countries")
   Call<List<mainclass>> Getcountries();
    @GET("countries")
   Call<CountryInfo> GetCountryInfo();
}
