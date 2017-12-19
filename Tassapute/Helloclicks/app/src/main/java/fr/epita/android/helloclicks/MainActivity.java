package fr.epita.android.helloclicks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;
import android.view.Menu;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "HelloClicksActivity";
    private final String defaut = "0";
    private int value = 0;
    private static int increment_value = 1;

    private Button clickMe = null;
    private Button reset = null;
    private Button normal = null;
    private Button big = null;
    private TextView increment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increment = (TextView)findViewById(R.id.increment);

        clickMe = (Button)findViewById(R.id.click_me);
        clickMe.setOnClickListener(this);

        reset = (Button)findViewById(R.id.reset);
        reset.setOnClickListener(this);

        normal = (Button)findViewById(R.id.normal);
        normal.setOnClickListener(this);

        big = (Button)findViewById(R.id.big);
        big.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_reset:
                increment.setText(defaut);
                value = 0;
                increment_value = 1;
                break;
            case R.id.menu_reverse:
                increment_value = -increment_value;
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.click_me) {
            Log.d(TAG, "Click on button 'Click me!");
            increment.setText(String.valueOf(value + increment_value));
            value += increment_value;
        }
        else if (view.getId() == R.id.reset) {
            Log.d(TAG, "Click on button 'Reset");
            increment.setText(defaut);
            value = 0;
            increment_value = 1;
        }
        else if (view.getId() == R.id.normal) {
            Log.d(TAG, "Click on button 'Normal");
            increment_value = 1;
        }
        else if (view.getId() == R.id.big) {
            Log.d(TAG, "Click on button 'Big");
            increment_value = 5;
        }
    }
}
