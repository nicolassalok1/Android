package com.example.nico.secondactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // création de l'intent : avec la classe contenant le OnCreate à éxecuter
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, SecondActivity.class);

        //message passé à l'intent
        String valeur = "http://www.epita.fr";
        intent.putExtra("cle", valeur);

        Button b2 = findViewById(R.id.Button2);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(intent);
    }
}
