package net.grzechocinski.android.dagger2example;

import android.app.Application;
import android.content.Context;
import net.grzechocinski.android.dagger2example.internal.di.D2EComponent;

public class D2EApplication extends Application {

    private D2EComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        buildComponentAndInject();
    }

    public void buildComponentAndInject() {
        component = D2EComponent.Initializer.init(this);
    }

    public static D2EComponent component(Context context) {
        return ((D2EApplication) context.getApplicationContext()).component;
    }
}
