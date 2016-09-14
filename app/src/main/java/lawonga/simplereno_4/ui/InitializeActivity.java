package lawonga.simplereno_4.ui;

import android.content.Intent;
import android.os.Bundle;

import lawonga.simplereno_4.base.BaseActivity;
import lawonga.simplereno_4.helper.PreferencesHelper;
import lawonga.simplereno_4.model.enums.Key;

/**
 * Created by Andy on 9/13/2016.
 * Run this on start. This can be a splash screen. Or not.
 * Run everything processor intensive IN THE BACKGROUND via INTENTSERVICE.
 */
public class InitializeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * Perform spawning of background initialization stuff here
         */
        PreferencesHelper preferencesHelper = PreferencesHelper.initInstance(getApplicationContext());
        if (preferencesHelper.getBoolean(Key.CONTRACTOR)) {
            Intent intent = new Intent(this, ContractorActivity.class);
        } else {
            // Default goes to customer side
            Intent intent = new Intent(this, CustomerActivity.class);
        }
    }
}
