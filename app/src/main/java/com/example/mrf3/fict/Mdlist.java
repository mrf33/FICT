package com.example.mrf3.fict;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mdlist extends AppCompatActivity implements OnClickListener {

    String cats [] = {"Bachelor in Business Information Technology","Bachelor in Electronic Commerce","Bachelor in Informatics & Visual Computing","Bachelor in Information and Communication Technology",
    "Bachelor in Information Technology","Bachelor in Software Engineering with Multimedia"};
    ListView lList ;
    ArrayAdapter<String> lAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdlist);

        lList = (ListView)findViewById(R.id.list_mj);
        lAdapter = new ArrayAdapter<String>(this,R.layout.newform2,cats);
        lList.setAdapter(lAdapter);
        lList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent("android.intent.action.BBIT_LIST"));
                        break;
                    case 1:
                        startActivity(new Intent("android.intent.action.BEC_LIST"));
                        break;
                    case 2:
                        startActivity(new Intent("android.intent.action.BIVC_LIST"));
                        break;
                    case 3:
                        //startActivity(new Intent("android.intent.action.MAIN"));
                        break;
                    case 4:
                        //startActivity(new Intent("android.intent.action.MAIN"));
                        break;
                    case 5:
                        //startActivity(new Intent("android.intent.action.MAIN"));
                        break;

                }
            }

        });

    }

    @Override
    public void onClick(View v) {

    }
}
