package edu.sjsu.android.instagrammy;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("B5bvJf008plIVD7rVbauYqrewYEVJjvwnl0Zrl8K")
                .clientKey("6gvaJ7x5ulx2VHeObTAvRIUUp97dGaYso3l3wVje")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
