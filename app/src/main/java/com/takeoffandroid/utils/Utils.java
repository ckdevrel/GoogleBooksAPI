package com.takeoffandroid.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

/**
 * Created by chandrasekar on 21/12/16.
 */

public class Utils {


    public static final <T> T buildResponseObjectFromJSONElement(JsonElement jsonElement, Class<T> pojo) {

        Gson gson = new Gson();
        String response = gson.toJson(jsonElement);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeNulls();
        return gsonBuilder.create().fromJson(response, pojo);
    }


}
