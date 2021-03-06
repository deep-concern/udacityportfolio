package com.wyattbarnes.udacityportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    // TODO have the function actually open the selected app
    /**
     * Displays a toast describing the app that will be opened based on the view's tag.
     *
     * @param view
     */
    public void openApp(View view) {
        Context context = getApplicationContext();
        int resId = getResources().getIdentifier("app_" + view.getTag().toString(), "string", getPackageName());
        String appName = getString(resId);
        CharSequence text = "This button will launch the '" + appName + "' app.";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
