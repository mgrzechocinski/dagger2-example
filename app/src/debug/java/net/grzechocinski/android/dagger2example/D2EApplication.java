package net.grzechocinski.android.dagger2example;

import android.os.StrictMode;
import timber.log.Timber;

public class D2EApplication extends D2EBaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        configureStrictMode();
        configureLogging();
    }

    private void configureLogging() {
        Timber.plant(new Timber.DebugTree());
    }

    private void configureStrictMode() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().penaltyDeathOnNetwork().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedSqlLiteObjects().detectLeakedClosableObjects().detectActivityLeaks().penaltyLog().build());
    }
}