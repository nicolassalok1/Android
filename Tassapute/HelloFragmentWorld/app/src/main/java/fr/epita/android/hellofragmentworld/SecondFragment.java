package fr.epita.android.hellofragmentworld;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tassadit on 28/11/2017.
 */

public class SecondFragment extends Fragment {

    public SecondFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        final View secondView = inflater.inflate(R.layout.fragment_second, container, false);
        return secondView;
    }
}
