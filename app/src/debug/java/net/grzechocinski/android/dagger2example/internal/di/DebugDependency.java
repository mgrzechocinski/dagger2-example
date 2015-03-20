package net.grzechocinski.android.dagger2example.internal.di;

import timber.log.Timber;

public class DebugDependency {

    public void doSthInDebug(){
        Timber.d("This is a debug build!");
    }


}
