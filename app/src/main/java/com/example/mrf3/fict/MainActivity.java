package com.example.mrf3.fict;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    ImageButton a,b,c,d,e,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (ImageButton)findViewById(R.id.lectureButton);
        b = (ImageButton)findViewById(R.id.aboutButton);
        c = (ImageButton)findViewById(R.id.locationButton);
        d = (ImageButton)findViewById(R.id.calendarButton);
        e = (ImageButton)findViewById(R.id.majorButton);
        f = (ImageButton)findViewById(R.id.contactButton);
        a.setOnClickListener(this);b.setOnClickListener(this);c.setOnClickListener(this);d.setOnClickListener(this);e.setOnClickListener(this);
        f.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lectureButton:
                startActivity(new Intent("android.intent.action.LLIST"));
                break;
            case R.id.contactButton:
                startActivity(new Intent("android.intent.action.CONTACT"));
                break;
            case R.id.majorButton:
                startActivity(new Intent("android.intent.action.MDLIST"));
                break;
            case R.id.calendarButton:
                startActivity(new Intent("android.intent.action.MLIST"));
                break;
            case R.id.locationButton:
                startActivity(new Intent("android.intent.action.LOCATION"));
                break;
            case R.id.aboutButton:
                startActivity(new Intent("android.intent.action.ABOUT"));
                break;
        }
    }
}
