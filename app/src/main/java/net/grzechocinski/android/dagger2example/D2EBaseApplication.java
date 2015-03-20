package net.grzechocinski.android.dagger2example;

import android.app.Application;
import android.content.Context;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.grzechocinski.android.dagger2example.internal.di.D2EComponent;
import net.grzechocinski.android.dagger2example.internal.di.Dagger_D2EComponent;
import net.grzechocinski.android.dagger2example.internal.di.SystemServicesModule;

public abstract class D2EBaseApplication extends Application {

    private D2EComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        buildComponentAndInject();
    }

    public void buildComponentAndInject() {
        component = DaggerComponentInitializer.init(this);
    }

    public static D2EComponent component(Context context) {
        return ((D2EBaseApplication) context.getApplicationContext()).component;
    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public final static class DaggerComponentInitializer {

        public static D2EComponent init(D2EBaseApplication app) {
            return Dagger_D2EComponent.builder()
                    .systemServicesModule(new SystemServicesModule(app))
                    .build();
        }

    }
}
