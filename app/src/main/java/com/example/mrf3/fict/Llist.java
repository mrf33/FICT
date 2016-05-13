package com.example.mrf3.fict;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Llist extends AppCompatActivity implements OnClickListener {

    String cats [] = {"Programe Leaders","YL & Principals","Lecturers"};
    ListView lList ;
    ArrayAdapter<String> lAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llist);
        lList = (ListView)findViewById(R.id.list_L);
        lAdapter = new ArrayAdapter<String>(this,R.layout.newform,cats);
        lList.setAdapter(lAdapter);
        lList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent("android.intent.action.Y_LEADERS"));
                        break;
                    case 1:
                        startActivity(new Intent("android.intent.action.LPL"));
                        break;
                    case 2:
                        startActivity(new Intent("android.intent.action.LECTURERS"));
                        break;

                }
            }

        });

    }

    @Override
    public void onClick(View v) {

    }
}
