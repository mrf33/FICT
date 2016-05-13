package com.example.mrf3.fict;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.VideoView;

public class About extends ActionBarActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("http://ia601506.us.archive.org/11/items/mrf3_hotmail_Fict_201510/fict.mp4");
        videoView.start();

    }

    public void onClick_pause(View v) {
        videoView.pause();
    }
    public void onClick_resume(View v) {

        videoView.start();
    }
    public void onClick_replay(View v) {
        videoView.resume();
        videoView.start();
    }

}
