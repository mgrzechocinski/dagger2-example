package net.grzechocinski.android.dagger2example.internal.di;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class DebugDependenciesModule {

    @Singleton
    @Provides
    DebugDependency provideDebugDependency() {
        return new DebugDependency();
    }
}
