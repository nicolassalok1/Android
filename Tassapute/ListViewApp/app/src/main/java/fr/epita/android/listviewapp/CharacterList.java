package fr.epita.android.listviewapp;

import java.util.ArrayList;

/**
 * Created by Tassadit on 05/12/2017.
 */

public class CharacterList {

    private ArrayList<MovieCharacter> characters = null;

    public CharacterList() {
        this.characters = new ArrayList<>();
    }

    public void fillList() {
        characters.add(new MovieCharacter("Harry", "Potter", "Harry Potter", Alignment.GOOD));
    }

    public ArrayList<MovieCharacter> getCharacters() {
        return characters;
    }
}
