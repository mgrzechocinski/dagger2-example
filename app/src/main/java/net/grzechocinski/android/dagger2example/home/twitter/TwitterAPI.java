package net.grzechocinski.android.dagger2example.home.twitter;

import android.content.Context;
import android.widget.Toast;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TwitterAPI {

    @Inject
    public TwitterAPI() {
    }

    public void tweet(Context context, String tweetBody){
        Toast.makeText(context, tweetBody, Toast.LENGTH_SHORT).show();
    }
}
