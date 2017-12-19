package fr.epita.android.hellointents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Tassadit on 26/11/2017.
 */

public class SecondActivity extends AppCompatActivity{

    private TextView text = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        String message = i.getStringExtra("message");

        if (message == null)
            message = "Aucun message envoyé!";

        text = findViewById(R.id.message_received);
        text.setText(message);

    }
}
