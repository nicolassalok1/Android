package fr.epita.android.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Tassadit on 05/12/2017.
 */

/* Associé à la widget List. Génère des views quand on le lui demande*/
public class MovieCharacterAdapter extends BaseAdapter {

    private CharacterList characterList;
    private Context context;

    public MovieCharacterAdapter(CharacterList characterList, Context context) {
        this.characterList = characterList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return characterList.getCharacters().size();
    }

    @Override
    public MovieCharacter getItem(int i) {
        return characterList.getCharacters().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        final LayoutInflater layoutInflater = LayoutInflater.from(context);
        View rowView = layoutInflater.inflate(R.layout.row_character, viewGroup, false);

        TextView firstnameTextView = rowView.findViewById(R.id.row_firstname);
        TextView lastnameTextView = rowView.findViewById(R.id.row_lastname);

        firstnameTextView.setText(getItem(position).getFirstname());
        lastnameTextView.setText(getItem(position).getLastname());
        return rowView;
    }
}
