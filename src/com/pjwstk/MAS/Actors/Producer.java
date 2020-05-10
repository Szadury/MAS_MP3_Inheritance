package com.pjwstk.MAS.Actors;

import com.pjwstk.MAS.Beverages.Alcohol;

import java.util.ArrayList;
import java.util.List;

public class Producer extends Person{
    List<Alcohol> beveragesProduced;


    public Producer(String imie, String nazwisko, String email, String password) {
        super(imie, nazwisko, email, password);
        this.beveragesProduced = new ArrayList<>();
    }

    public List<Alcohol> getBeveragesProduced() {
        return beveragesProduced;
    }

    public void setBeveragesProduced(List<Alcohol> beveragesProduced) {
        this.beveragesProduced = beveragesProduced;
    }

    @Override
    public void showOwnedList() {
        System.out.println(beveragesProduced);
    }

    @Override
    public void addOwnedElement(Object object) {
        if(Alcohol.class.isAssignableFrom(object.getClass())) {
            beveragesProduced.add((Alcohol) object);
        }
        else {
            System.out.println("Object is not extended from Alcohol.class");
        }
    }
}
