package com.example.googlemaps;

import android.app.Application;

import androidx.room.Room;

import com.example.googlemaps.data.frameworks.room.database.AppDataBase;

public class App extends Application {

    public static AppDataBase appDataBase;

    @Override
    public void onCreate() {
        super.onCreate();

        appDataBase = Room.databaseBuilder(
                this,
                AppDataBase.class,
                BuildConfig.DB_NAME)
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build();

    }
}
