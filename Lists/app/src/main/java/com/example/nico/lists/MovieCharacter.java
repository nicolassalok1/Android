package com.example.nico.lists;

/**
 * Created by nico on 05/12/2017.
 */

public class MovieCharacter {

    private String FirstName;
    private String LastName;
    private Boolean GoodGuy;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Boolean getGoodGuy() {
        return GoodGuy;
    }

    public void setGoodGuy(Boolean goodGuy) {
        GoodGuy = goodGuy;
    }

    public MovieCharacter(String firstName, String lastName, Boolean goodGuy) {
        FirstName = firstName;
        LastName = lastName;
        GoodGuy = goodGuy;
    }



}
