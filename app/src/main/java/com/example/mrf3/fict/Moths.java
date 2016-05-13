package com.example.mrf3.fict;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

public class Moths extends AppCompatActivity implements OnClickListener {

    String [] mns = {"May","June","July"};
    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlist);

        listView = (ListView)findViewById(R.id.list_M);
        adapter = new ArrayAdapter<String>(this,R.layout.newform,mns);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(),parent.getItemIdAtPosition(position)+" selected item",Toast.LENGTH_LONG).show();
                switch (position) {
                    case 0:
                        startActivity(new Intent("android.intent.action.CALENDAR1"));
                        break;
                    case 1:
                        startActivity(new Intent("android.intent.action.CALENDAR2"));
                        break;
                    case 2:
                        startActivity(new Intent("android.intent.action.CALENDAR3"));
                        break;

                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
