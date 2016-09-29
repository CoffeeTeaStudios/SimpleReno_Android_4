package lawonga.simplereno_4.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import lawonga.simplereno_4.R;
import lawonga.simplereno_4.adapter.JobTypeAdapter;
import lawonga.simplereno_4.base.BaseActivity;

/**
 * Created by Andy on 9/13/2016.
 * Root activity for our customers
 * We want to a list of items in a recyclerView
 */
public class CustomerActivity extends BaseActivity {

    // String of categories TODO temp
    private ArrayList<String> categoryString = new ArrayList<>();

    @BindView(R.id.main_recycler) RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_generic);

        // RecyclerView stuff
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new JobTypeAdapter(categoryString));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
