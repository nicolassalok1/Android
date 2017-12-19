package fr.epita.android.hellointents;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button button_go = null;
    private Button button_url = null;
    private String url = "http://www.epita.fr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_go = (Button)findViewById(R.id.switch_button);
        button_url = (Button)findViewById(R.id.open_url);

        button_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
                secondActivity.putExtra("message", "I am on the second activity!");
                startActivity(secondActivity);
            }
        });

        button_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent implicitActivity = new Intent(Intent.ACTION_VIEW);
                implicitActivity.setData(Uri.parse(url));
                startActivity(implicitActivity);
            }
        });
    }
}
