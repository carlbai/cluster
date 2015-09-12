package com.baibye.cluster;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by carlbai on 9/11/15.
 */
public class SetPersistence extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("SLDJFLKSDJFLKJ");
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}
