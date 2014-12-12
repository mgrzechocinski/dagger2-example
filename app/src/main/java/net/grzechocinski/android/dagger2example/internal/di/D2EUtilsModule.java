package net.grzechocinski.android.dagger2example.internal.di;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import net.grzechocinski.android.dagger2example.internal.utils.D2ECollectionUtils;

@Module
public class D2EUtilsModule {

    @Provides
    @Singleton
    D2ECollectionUtils provideStringUtils() {
        return new D2ECollectionUtils();
    }
}
