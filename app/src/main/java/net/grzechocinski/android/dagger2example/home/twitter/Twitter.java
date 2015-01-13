package net.grzechocinski.android.dagger2example.home.twitter;

import android.content.Context;
import javax.inject.Inject;

public class Twitter {

    private Context appContextProvider;

    private TwitterAPI twitterAPI;

    @Inject
    public Twitter(Context appContextProvider, TwitterAPI twitterAPI) {
        this.appContextProvider = appContextProvider;
        this.twitterAPI = twitterAPI;
    }

    public void tweet(String tweetBody){
        twitterAPI.tweet(appContextProvider, tweetBody);
    }
}
