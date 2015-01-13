package net.grzechocinski.android.dagger2example.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import javax.inject.Inject;
import net.grzechocinski.android.dagger2example.D2EApplication;
import net.grzechocinski.android.dagger2example.R;
import net.grzechocinski.android.dagger2example.utils.NetworkStateManager;

public class BaseActivity extends FragmentActivity {

    @Inject
    SharedPreferences sharedPreferences;
}
