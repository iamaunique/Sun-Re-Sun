package com.valdioveliu.valdio.audioplayer;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.lang.reflect.Type;


public class StorageUtil {

    private Context context;

    public StorageUtil(Context context) {
        this.context = context;
    }

    public void storeAudio(ArrayList < Audio > arrayList) {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.apply();
    }

    public ArrayList < Audio > loadAudio() {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);
        Gson gson = new Gson();
        return gson.fromJson(json, type);
    }

    public void storeAudioIndex(int index) {
        editor.putInt("audioIndex", index);
        editor.apply();
    }

}
