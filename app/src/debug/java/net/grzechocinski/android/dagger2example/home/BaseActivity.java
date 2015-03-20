package net.grzechocinski.android.dagger2example.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import javax.inject.Inject;
import net.grzechocinski.android.dagger2example.D2EApplication;
import net.grzechocinski.android.dagger2example.internal.di.DebugDependency;

public class BaseActivity extends FragmentActivity {

    @Inject
    SharedPreferences sharedPreferences;

    @Inject
    DebugDependency debugDependency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        D2EApplication.component(this).inject(this);

        debugDependency.doSthInDebug();
    }
}
