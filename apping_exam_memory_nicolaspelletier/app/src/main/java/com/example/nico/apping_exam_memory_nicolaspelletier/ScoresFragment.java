package com.example.nico.apping_exam_memory_nicolaspelletier;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by nico on 19/12/2017.
 */

public class ScoresFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.list_fragment, container, false);

        ListView firstList = view.findViewById(R.id.first_list);
        List<Scores> data = new ArrayList<>();
        View emptylistview = view.findViewById(R.id.activity_main_text_emptylist);
        firstList.setEmptyView(emptylistview);
        Integer IntTest = new Integer(12);

        Date dateTest = new Date(IntTest,IntTest,IntTest);

        data.add(new Scores(dateTest, true, 7));
        data.add(new Scores(dateTest, false, 0));

        firstList.setAdapter(new ScoreAdapter(data, getActivity()));

        return view;
    }
}
