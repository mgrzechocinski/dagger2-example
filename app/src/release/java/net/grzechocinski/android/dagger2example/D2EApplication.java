package net.grzechocinski.android.dagger2example;

import timber.log.Timber;

public class D2EApplication extends D2EBaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        disableLogging();
    }

    private void disableLogging() {
        Timber.plant(new Timber.HollowTree());
    }
}
