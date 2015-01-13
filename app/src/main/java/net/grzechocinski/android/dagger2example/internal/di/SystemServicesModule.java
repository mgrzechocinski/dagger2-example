package net.grzechocinski.android.dagger2example.internal.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.preference.PreferenceManager;
import android.support.v4.net.ConnectivityManagerCompat;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import net.grzechocinski.android.dagger2example.utils.NetworkStateManager;

@Module
public class SystemServicesModule {

    private final Application application;

    public SystemServicesModule(Application application) {
        this.application = application;
    }

    @Provides
    Context provideContext(){
        return application;
    }

    @Provides
    @Singleton
    SharedPreferences providePreferenceManager() {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }

    @Provides
    @Singleton
    ConnectivityManager provideConnectivityManager() {
        return (ConnectivityManager) application.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    @Provides
    @Singleton
    //Method parameter injected by Dagger2
    NetworkStateManager provideNetworkStateManager(ConnectivityManager connectivityManagerCompat) {
        return new NetworkStateManager(connectivityManagerCompat);
    }
}
