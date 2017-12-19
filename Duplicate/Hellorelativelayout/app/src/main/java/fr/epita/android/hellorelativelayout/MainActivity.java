package fr.epita.android.hellorelativelayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "HelloWorldActivity";
    private int counter = 0;
    private int step = 1;
    private boolean is_add = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button clikmeButton = (Button) findViewById(R.id.ClickMeButton);
        clikmeButton.setOnClickListener(this);

        Button resetButton = (Button) findViewById(R.id.ResetButton);
        resetButton.setOnClickListener(this);

        Button bigButton = (Button) findViewById(R.id.BigButton);
        bigButton.setOnClickListener(this);

        Button normalButton = (Button) findViewById(R.id.NormalButton);
        normalButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView textView;
        switch(item.getItemId()) {
            case R.id.action_settings:

                counter = 0;
                textView = findViewById(R.id.Compteur);
                textView.setText(String.valueOf(counter));
                Toast
                        .makeText(MainActivity.this, "Reset !", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.reverse:
                is_add = !is_add;
                break;
            default:
                break;
        }
        return true;
    }


    @Override
    public void onClick(View view) {
        TextView textView;
        switch (view.getId())
        {
            case R.id.ClickMeButton:
                Toast
                        .makeText(MainActivity.this, "Clicked !", Toast.LENGTH_SHORT)
                        .show();
                if (is_add)
                    counter+=step;
                else
                    counter-=step;
                textView = findViewById(R.id.Compteur);
                textView.setText(String.valueOf(counter));
                break;
            case R.id.ResetButton:
                counter = 0;
                textView = findViewById(R.id.Compteur);
                textView.setText(String.valueOf(counter));
                break;
            case  R.id.NormalButton:
                step = 1;
                textView = findViewById(R.id.idStep);
                textView.setText(String.valueOf(step));
                break;
            case R.id.BigButton:
                step++;
                textView = findViewById(R.id.idStep);
                textView.setText(String.valueOf(step));
                break;
            default:
                break;
        }
    }
}


/*
* popupbuilder.setpositive/negativeButton;
* popup.setButton(AlertDialog.BUTTON_POSITIVE, "YES", alertlistener);
*
*
* DialogInterface.OnClickListerner alerlistyerner = new DialogIterface.OnclickListener();
*
*
* */