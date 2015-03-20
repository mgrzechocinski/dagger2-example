package net.grzechocinski.android.dagger2example.internal.di;

import net.grzechocinski.android.dagger2example.D2EApplication;
import net.grzechocinski.android.dagger2example.home.HomeActivity;
import net.grzechocinski.android.dagger2example.utils.D2ECollectionUtils;

public interface D2EGraph {

    void inject(D2EApplication app);

    void inject(HomeActivity app);

    D2ECollectionUtils getD2EStringUtils();
}
