package com.takeoffandroid.googlebooksapi.apicalls;

import com.google.gson.JsonElement;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Interface used to call Books services in the backend.
 */
public interface BooksAPIService {


    @GET
    Call<JsonElement> getVolumes(@Url String appendURL, @QueryMap HashMap<String, String> queryMap);
}
