package com.example.shashankreddy.couachbase_dagger_demo;

import android.app.Activity;
import android.content.Context;

import com.couchbase.lite.Manager;
import com.couchbase.lite.android.AndroidContext;

import java.io.IOException;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by shashank reddy on 2/8/2017.
 */
@Module
public class MyAppModule {
    Activity mActivity;
    Context context;
    public MyAppModule(Activity mActivity){
        this.mActivity = mActivity;
    }

    public MyAppModule(Context applicationContext) {
        this.context = applicationContext;
    }

    @Provides
    @Singleton
    Manager provideManager(){
        Manager manger = null;
        try {
            manger = new Manager(new AndroidContext(mActivity),Manager.DEFAULT_OPTIONS);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return manger;
    }


}
