package com.example.nico.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

/**
 * Created by nico on 05/12/2017.
 */

public class SecondFragment extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.second_fragment, container, false);

        Button button = rootView.findViewById(R.id.subaru2);
        button.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        FirstFragInteractionListener context = (FirstFragInteractionListener) getActivity();
        context.ButtonClick2();
    }
}
