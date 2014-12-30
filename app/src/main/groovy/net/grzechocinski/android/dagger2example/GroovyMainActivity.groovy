package net.grzechocinski.android.dagger2example

import android.app.Activity
import android.os.Bundle
import groovy.transform.CompileStatic

@CompileStatic
class GroovyMainActivity extends Activity {

    //private static final String PREF_KEY_SAMPLE = "PREF_KEY_SAMPLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home);
        def btn = findViewById(R.id.d2e_id_btn_load_preference)
        btn.onClickListener = { println "aaa" }
    }

    /*@Inject
    SharedPreferences sharedPreferences;

    @InjectView(R.id.d2e_id_tv_pref)
    TextView preferenceValueTextView;

    @InjectView(R.id.d2e_id_tv_util)
    TextView utilOutputTextView;

    @InjectView(R.id.d2e_id_btn_load_preference)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.inject(this);

        //Inject to non-private fields
        D2EApplication.component(this).inject(this);

        //Inject to private fields of local variables
        D2ECollectionUtils d2EStringUtils = D2EApplication.component(this).getD2EStringUtils();

        //Lambda usage example
        button.setOnClickListener(v -> {
            sharedPreferences.edit().putString(PREF_KEY_SAMPLE, "foo").apply();
            preferenceValueTextView.setText(sharedPreferences.getString(PREF_KEY_SAMPLE, "bar"));
        });

        //Method reference example
        List<String> sortedAscending = d2EStringUtils.toSortedList(String::compareTo, "zombie", "dog", "animal");
        utilOutputTextView.setText(sortedAscending.get(0));*/
}
