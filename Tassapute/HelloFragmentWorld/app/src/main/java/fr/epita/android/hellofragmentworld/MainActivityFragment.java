package fr.epita.android.hellofragmentworld;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Tassadit on 28/11/2017.
 */

public class MainActivityFragment extends Fragment {

    public interface MainActivityFragmentCallback{
        void onButtonClicked();
    }

    private Activity context = getActivity();
    private Button goNext = null;
    private View rootView;
    private MainActivityFragmentCallback mainFragmentCallback;

    public MainActivityFragment() {

    }

    public static MainActivityFragment newInstance(String title) {
        MainActivityFragment fragment = new MainActivityFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message", "");
        fragment.setArguments(bundle);
        return fragment;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mainFragmentCallback = (MainActivityFragmentCallback) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement onButtonClicked");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainFragmentCallback = null;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }

    /*@Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        goNext = (Button) rootView.findViewById(R.id.goNext);

        View.OnClickListener goNextFragmentListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked(view);
            }
        };

        goNext.setOnClickListener(goNextFragmentListener);
    }

    public void buttonClicked (View view) {
        // MainActivityFragmentCallback parent = (MainActivityFragmentCallbackget) Activity()
        // parent.onButtonClicked();
        mainFragmentCallback.onButtonClicked();
    }*/

}
