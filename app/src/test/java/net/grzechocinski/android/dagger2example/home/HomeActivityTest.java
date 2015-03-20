package net.grzechocinski.android.dagger2example.home;

import android.content.Context;
import net.grzechocinski.android.dagger2example.D2EApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HomeActivityTest {

    @InjectMocks
    private Context mockContext;

    @Test
    public void shouldBeTrue() throws Exception {
        //given
        D2EApplication.component(mockContext).inject(this);

        //when

        //then
    }

}
