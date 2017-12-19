package fr.epita.android.hellorelativelayout;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.DialogInterface;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonTop = null;
    private Button buttonBottom = null;
    private TextView tv_right = null;
    private TextView tv_left = null;
    private AlertDialog.Builder popup_builder = null;
    private AlertDialog popup_top = null;
    private AlertDialog popup_bottom = null;
    private TextView tv_top = null;
    private TextView tv_bottom = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTop = (Button)findViewById(R.id.b1);
        buttonTop.setOnClickListener(clickListenerButtonTop);

        buttonBottom = (Button)findViewById(R.id.b2);
        buttonBottom.setOnClickListener(clickListenerButtonButtom);

        tv_left = (TextView) findViewById(R.id.tv1);
        tv_right = (TextView) findViewById(R.id.tv2);

        initPopupBuilder();
    }

    private void initPopupBuilder() {
        popup_builder = new AlertDialog.Builder(MainActivity.this);
        popup_builder.setTitle("My popup");
        popup_builder.setMessage("Click Yes please");
    }

    private OnClickListener clickListenerButtonTop = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            popup_top = popup_builder.create();

            popup_top.setTitle("Title for top popup");
            popup_top.setMessage("Show top text ?");

            popup_top.setButton(AlertDialog.BUTTON_POSITIVE, "Yes", alertListener);
            popup_top.setButton(AlertDialog.BUTTON_NEGATIVE, "No", alertListener);
            popup_top.show();
        }
    };


    DialogInterface.OnClickListener alertListener = new DialogInterface.OnClickListener() {
        @Override public void onClick(DialogInterface dialogInterface, int whichButton) {
            if (dialogInterface.equals(popup_top)) {
                if (whichButton == DialogInterface.BUTTON_POSITIVE) {
                    tv_top = new TextView(MainActivity.this);
                    tv_top.setText(R.string.text_view_top);

                    RelativeLayout main = (RelativeLayout) findViewById(R.id.main_layout);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);

                    main.addView(tv_top);

                    RelativeLayout.LayoutParams rlp = (RelativeLayout.LayoutParams) tv_top.getLayoutParams();
                    rlp.addRule(RelativeLayout.RIGHT_OF, tv_left.getId());
                    rlp.addRule(RelativeLayout.ABOVE, buttonTop.getId());
                    rlp.setMargins(0,0,0,1);
                }
                if (whichButton == DialogInterface.BUTTON_NEGATIVE) {
                    tv_top.setVisibility(View.INVISIBLE);
                }
            }

            if (dialogInterface.equals(popup_bottom)) {
                if (whichButton == DialogInterface.BUTTON_POSITIVE) {
                    tv_bottom = new TextView(MainActivity.this);
                    tv_bottom.setText(R.string.text_view_bottom);

                    RelativeLayout main = (RelativeLayout) findViewById(R.id.main_layout);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);

                    main.addView(tv_bottom);

                    RelativeLayout.LayoutParams rlp = (RelativeLayout.LayoutParams) tv_bottom.getLayoutParams();
                    rlp.addRule(RelativeLayout.RIGHT_OF, tv_left.getId());
                    rlp.addRule(RelativeLayout.BELOW, buttonBottom.getId());
                }
                if (whichButton == DialogInterface.BUTTON_NEGATIVE) {
                    tv_bottom.setVisibility(View.INVISIBLE);
                }
            }
        }
    };

    private OnClickListener clickListenerButtonButtom = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            popup_bottom = popup_builder.create();

            popup_bottom.setTitle("Title for bottom popup");
            popup_bottom.setMessage("Show buttom text ?");

            popup_bottom.setButton(AlertDialog.BUTTON_POSITIVE, "Yes", alertListener);
            popup_bottom.setButton(AlertDialog.BUTTON_NEGATIVE, "No", alertListener);

            popup_bottom.show();
        }
    };
}
