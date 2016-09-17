package lawonga.simplereno_4.ui;

import android.content.Intent;
import android.os.Bundle;

import lawonga.simplereno_4.base.BaseActivity;

/**
 * Created by Andy on 9/13/2016.
 * Run this on start. This can be a splash screen. Or not.
 * Run everything processor intensive IN THE BACKGROUND via INTENTSERVICE.
 */
public class InitializeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Start login activity
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
