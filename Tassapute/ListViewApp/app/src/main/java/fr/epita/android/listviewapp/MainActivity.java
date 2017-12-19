package fr.epita.android.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView characters = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        characters = (ListView) findViewById(R.id.activityMainListCharacters);

        CharacterList charactersList = new CharacterList();

        View emptyListView = findViewById(R.id.emtyList);
        characters.setEmptyView(emptyListView);
        charactersList.fillList();

        characters.setAdapter(new MovieCharacterAdapter(charactersList, MainActivity.this));
    }
}
