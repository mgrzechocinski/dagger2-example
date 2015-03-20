package net.grzechocinski.android.dagger2example.home;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import javax.inject.Inject;

public class BaseActivity extends FragmentActivity {

    @Inject
    SharedPreferences sharedPreferences;
}
