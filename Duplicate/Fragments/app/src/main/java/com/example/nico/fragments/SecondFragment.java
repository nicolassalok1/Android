package com.example.nico.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

/**
 * Created by nico on 05/12/2017.
 */

public class SecondFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.second_fragment, container, false);

        Bundle argumentsBundle = getArguments();
        String message = argumentsBundle.getString("message");

        Button Tmessage = rootView.findViewById(R.id.message2);

        Tmessage.setText(message);

        Tmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FirstFregment.FirstFragInteractionListener context = (FirstFregment.FirstFragInteractionListener) getActivity();
                context.ButtonClick1();
            }
        });
        return rootView; }
}



//Log.d(TAG, message);

//Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
