package com.pjwstk.MAS.Actors;

import com.pjwstk.MAS.Places.Place;

import java.util.ArrayList;
import java.util.List;

public class PlaceOwner extends Person{
    List<Place> placesOwned;

    public PlaceOwner(String imie, String nazwisko, String email, String password) {
        super(imie, nazwisko, email, password);
        this.placesOwned = new ArrayList<>();
    }

    @Override
    public void showOwnedList() {
        System.out.println(placesOwned);
    }

    @Override
    public void addOwnedElement(Object object) {
        if(object.getClass() == Place.class) {
            placesOwned.add((Place)object);
        }
        else{
            System.out.println("Given object is not a Place");
        }
    }
}
