package com.example.mrf3.fict;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class BEC_list extends AppCompatActivity implements OnClickListener {

    String cats [] = {"First year","Second year","Third year"};
    ListView lList ;
    ArrayAdapter<String> lAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bec_list);

        lList = (ListView) findViewById(R.id.list_bec);
        lAdapter = new ArrayAdapter<String>(this, R.layout.newform, cats);
        lList.setAdapter(lAdapter);
        lList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent("android.intent.action.BEC_Y1"));
                        break;
                    case 1:
                        startActivity(new Intent("android.intent.action.BEC_Y2"));
                        break;
                    case 2:
                        startActivity(new Intent("android.intent.action.BEC_Y3"));
                        break;

                }
            }

        });
    }

    @Override
    public void onClick(View v) {

    }
}
