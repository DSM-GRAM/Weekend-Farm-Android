package com.farm.weekend.gram.weekend_farm_user.util;

import android.content.Context;
import android.widget.Toast;

public final class UtilClass {

    public static final String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJqdGkiOiI1MWI3NTQ4OC1jZTg0LTRiNzEtYjgzYi0zNzgwMDVkODg0NDQiLCJmcmVzaCI6ZmFsc2UsInR5cGUiOiJhY2Nlc3MiLCJpZGVudGl0eSI6ImFiYyIsImlhdCI6MTUzNTczNzI5MiwibmJmIjoxNTM1NzM3MjkyLCJleHAiOjE1MzgzMjkyOTJ9.7bG0O8YLxYTMdt8WyTR76LV_4d7wB8kFvt4hHpBKrFc";

    public static void Toast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
