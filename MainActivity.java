package com.example.jonaszrudnik.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//KOMENTARZ DLA OLI - tu zamiast maina ma być menu zdjęć których jeszcze nie zindeksowano
public class MainActivity extends AppCompatActivity {



    Button button1;


    //@Override
    public void buttonOnClick(View v) {
        // setIntent();
        Intent i = new Intent(this, IndexingActivity.class);
        startActivity(i);
        //setContentView(R.layout.activity_main);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intialization Button

       // button1 = (Button) findViewById(R.id.indexing);
        //btnClickMe.setOnClickListener(MainActivity.this);
        //onClick(btnClickMe);
        //btnClickMe.setOnClickListener(MainActivity.btnClickMe);
        //Here MainActivity.this is a Current Class Reference (context)
    }
}