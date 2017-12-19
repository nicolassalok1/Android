package com.example.nico.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by nico on 05/12/2017.
 */

public class FirstFregment extends Fragment implements View.OnClickListener {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button button = view.findViewById(R.id.subaru);
        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        FirstFragInteractionListener context = (FirstFragInteractionListener) getActivity();
        context.ButtonClick1();
    }
}

interface FirstFragInteractionListener
{
    void ButtonClick1();
    void ButtonClick2();
}