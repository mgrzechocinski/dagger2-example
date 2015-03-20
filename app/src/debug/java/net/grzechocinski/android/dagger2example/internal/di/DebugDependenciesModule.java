package net.grzechocinski.android.dagger2example.internal.di;

import dagger.Provides;
import javax.inject.Singleton;

public class DebugDependenciesModule {

    @Singleton
    @Provides
    DebugDependency provideDebugDependency() {
        return new DebugDependency();
    }
}
