package com.example.mrf3.fict;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Contact extends AppCompatActivity {
    public void SendIt (String em) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto",em, null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "FICT app");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }
    public void Khan (View view) {
        SendIt("minul.khan@limkokwing.edu.com");
    }
    public void Ng(View view){
        SendIt("kahkeong.ng@limkokwing.edu.com");
    }
    public void Vin(View view){
        SendIt("vinod.ramanathan@limkokwing.edu.com");
    }
    public void Nur(View view){
        SendIt("izan@limkokwing.edu.com");
    }
    public void Wae(View view){
        SendIt("wael.fawkhiri@limkokwing.edu.com");
    }
    public void Hem (View view){
        SendIt("hemant.singh@limkokwing.edu.com");
    }
    public void Kel (View view) {
        SendIt("kelvin.kimani@limkokwing.edu.com");
    }
    public void Mat (View view){
        SendIt("matthew@limkokwing.edu.com");
    }
    public void Hos (View view){
        SendIt("babaei@limkokwing.edu.com");
    }
    public void Prin(View view) {
        SendIt("princewill.iwuorie@limkokwing.edu.com");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

}
