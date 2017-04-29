package com.example.jonaszrudnik.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IndexingPhotosActivity extends AppCompatActivity {

    //@Override
    public void photoOnClick(View v) {
        // setIntent();
        Intent i = new Intent(this, IndexingActivity.class);
        startActivity(i);
        //setContentView(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indexing_photos);
    }
}
