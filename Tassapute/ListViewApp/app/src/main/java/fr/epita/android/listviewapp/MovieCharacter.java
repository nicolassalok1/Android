package fr.epita.android.listviewapp;

/**
 * Created by Tassadit on 05/12/2017.
 */

public class MovieCharacter {

    private String firstname;
    private String lastname;
    private String movie;
    private Alignment alignment;

    public MovieCharacter(String firstname, String lastname, String movie, Alignment alignment) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.movie = movie;
        this.alignment = alignment;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMovie() {
        return movie;
    }

    public Alignment getAlignment() {
        return alignment;
    }
}
