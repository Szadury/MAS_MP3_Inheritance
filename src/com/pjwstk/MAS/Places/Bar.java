package com.pjwstk.MAS.Places;

import com.pjwstk.MAS.Beverages.Alcohol;

import java.util.List;

public class Bar{
    Place place;
    List<Alcohol> alcoholList;

    private Bar(Place place, List<Alcohol> alcoholList) {
        this.place = place;
        this.alcoholList = alcoholList;
    }

    public List<Alcohol> getAlcoholList() {
        return alcoholList;
    }

    public void addAlcoholToList(Alcohol alcohol){
        if(alcohol != null && !alcoholList.contains(alcohol)) {
            alcoholList.add(alcohol);
        }
    }

    public static Bar createBar(Place place, List<Alcohol> alcoholList) throws Exception {
        if(place == null) {
            throw new Exception("The given whole does not exist!");
        }
        return new Bar(place, alcoholList);
    }
}
