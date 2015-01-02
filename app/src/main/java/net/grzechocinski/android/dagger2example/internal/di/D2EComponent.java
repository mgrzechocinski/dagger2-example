package net.grzechocinski.android.dagger2example.internal.di;

import dagger.Component;
import javax.inject.Singleton;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.grzechocinski.android.dagger2example.D2EApplication;
import net.grzechocinski.android.dagger2example.home.HomeActivity;
import net.grzechocinski.android.dagger2example.utils.D2ECollectionUtils;

@Singleton
@Component(modules = {SystemServicesModule.class, D2EUtilsModule.class})
public interface D2EComponent {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public final static class Initializer {

        public static D2EComponent init(D2EApplication app) {
            return Dagger_D2EComponent.builder()
                    .systemServicesModule(new SystemServicesModule(app))
                    .build();
        }

    }

    void inject(D2EApplication app);

    void inject(HomeActivity app);

    D2ECollectionUtils getD2EStringUtils();
}
