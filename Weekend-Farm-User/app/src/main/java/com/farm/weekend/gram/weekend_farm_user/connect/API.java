package com.farm.weekend.gram.weekend_farm_user.connect;

import com.google.gson.JsonArray;

import org.json.JSONArray;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface API {
    @GET("users/{user}/repos")
    Call<JsonArray> getUserRepositories(@Path("user") String userName);

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @GET("/user/search")
    Call<JsonArray> getSearchResult(@Header("Authorization") String Authorization, @Query("donum") int donum);

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @GET("/user/store/apply")
    Call<JsonArray> getStoreApply(@Header("Authorization") String Authorization);
}
