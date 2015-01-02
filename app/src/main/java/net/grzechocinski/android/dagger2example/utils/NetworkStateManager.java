package net.grzechocinski.android.dagger2example.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkStateManager {

    private final ConnectivityManager connectivityManager;

    public NetworkStateManager(ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }

    public boolean isConnectedOrConnecting(){
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo.isConnectedOrConnecting();
    }
}
