package com.example.nico.lists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nico on 05/12/2017.
 */

public class FirstFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.first_fragment, container, false);

        ListView firstList = view.findViewById(R.id.first_list);
        List<MovieCharacter> data = new ArrayList<>();
        View emptylistview = view.findViewById(R.id.activity_main_text_emptylist);
        firstList.setEmptyView(emptylistview);

        data.add(new MovieCharacter("Yvael", "Seh", true));
        data.add(new MovieCharacter("Ibra", "Curry", true));

        firstList.setAdapter(new MovieCharacterAdapter(data, getActivity()));

        return view;
    }

}
