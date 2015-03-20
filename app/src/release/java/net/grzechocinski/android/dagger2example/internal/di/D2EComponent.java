package net.grzechocinski.android.dagger2example.internal.di;

import dagger.Component;
import javax.inject.Singleton;

/**
 * This class is in release/ folder. You can use it to define injects or getters for dependencies only in release variant
 */
@Singleton
@Component(modules = {SystemServicesModule.class, D2EUtilsModule.class})
public interface D2EComponent extends D2EGraph {
}
