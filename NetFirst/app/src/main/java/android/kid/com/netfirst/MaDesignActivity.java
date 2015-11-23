package android.kid.com.netfirst;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;

public class MaDesignActivity extends AppCompatActivity {

    FloatingActionButton fab_btn;
    CoordinatorLayout root;
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.center_main);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collaspingToolbarLayout);
        collapsingToolbarLayout.setTitle("IT职业");
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        root = (CoordinatorLayout) findViewById(R.id.root);
        fab_btn = (FloatingActionButton) findViewById(R.id.fab_btn);
        fab_btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(root, "我出来了",Snackbar.LENGTH_LONG).setAction("知道了", new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
            }
        });
    }
}
