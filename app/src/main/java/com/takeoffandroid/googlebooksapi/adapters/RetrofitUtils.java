package com.takeoffandroid.googlebooksapi.adapters;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by chandrasekar on 21/12/16.
 */

public class RetrofitUtils {


    public static  <T> T createRetrofitService(String baseURL, Class<T> apiServiceClass) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(apiServiceClass);
    }


}
