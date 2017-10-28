package com.example.shashankreddy.couachbase_dagger_demo;

import android.app.Application;

/**
 * Created by shashank reddy on 2/8/2017.
 */
public class AppContext extends Application {
    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
       // appComponent= DaggerAppComponent.builder().myAppModule(new MyAppModule(getApplicationContext())).build();
    }

   /* AppComponent getAppComponent(){
        return appComponent;
    }*/
}
