package com.example.nico.secondactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent2 = new Intent(Intent.ACTION_VIEW);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //On récupère
        Intent intent = getIntent();
        // extract data from the intent
        String valeur = intent.getStringExtra("cle");

        intent2.setData(Uri.parse(valeur));//valeur est l'url à accéder

        Button b1 = findViewById(R.id.Button1);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        startActivity(intent2);
    }
}
