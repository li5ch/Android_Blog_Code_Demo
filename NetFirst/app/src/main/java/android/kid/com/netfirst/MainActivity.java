package android.kid.com.netfirst;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_layout);
        TabLayout tab = (TabLayout) findViewById(R.id.tabs);
        tab.addTab(tab.newTab().setText("Tab1"));
        tab.addTab(tab.newTab().setText("Tab2"));
        tab.addTab(tab.newTab().setText("Tab3"));
        tab.addTab(tab.newTab().setText("Tab4"));
    }
}
