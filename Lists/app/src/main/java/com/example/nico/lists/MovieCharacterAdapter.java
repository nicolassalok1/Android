package com.example.nico.lists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nico on 05/12/2017.
 */

public class MovieCharacterAdapter extends BaseAdapter {

    private List<MovieCharacter> data;
    private Context context;

    public MovieCharacterAdapter(List<MovieCharacter> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public MovieCharacter getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //1 : LayoutInflater pour créer les row d'index 'i'
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //2 : création des lignes qu'il va falloir afficher
        View row_view = layoutInflater.inflate(R.layout.row_character, viewGroup, false);

        //3 : on récupère les Champs à remplir depuis la row pour les remplir avec les API
        TextView firstNameTextView = row_view.findViewById(R.id.row_firstname);
        TextView lastNameTextView = row_view.findViewById(R.id.row_lastname);

        //4 : on les rempli
        firstNameTextView.setText(getItem(i).getFirstName());
        lastNameTextView.setText(getItem(i).getLastName());

        //5 : on return la row correctement créée
        return row_view;
    }
}
