package fr.epita.android.hellofragmentworld;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Tassadit on 29/11/2017.
 */

public class ThirdFragment extends Fragment {

    public ThirdFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        final View thirdView = inflater.inflate(R.layout.fragment_third, container, false);
        return thirdView;
    }
}
