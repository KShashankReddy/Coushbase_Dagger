package com.example.shashankreddy.couachbase_dagger_demo;

import com.couchbase.lite.Manager;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by shashank reddy on 2/8/2017.
 */

@Singleton
@Component(modules = {
        MyAppModule.class,
})

public interface AppComponent {
   //void injectMain(MainActivity mainActivity);
    Manager provManager();
}
