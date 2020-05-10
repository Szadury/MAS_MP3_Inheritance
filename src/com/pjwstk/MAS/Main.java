package com.pjwstk.MAS;

import com.pjwstk.MAS.Actors.*;
import com.pjwstk.MAS.Beverages.Beer;
import com.pjwstk.MAS.Beverages.BeerWithWine;
import com.pjwstk.MAS.Beverages.Wine;
import com.pjwstk.MAS.Places.Place;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        //Abstract Person, PlaceOwner, Producer, User
        //Overlapping Place, Bar, Restaurant and BarRestaurant;
        //Wieloaspektowae Place -> Prestige and Type
        Person p1 = new PlaceOwner("wojtek", "szadurski", "ws@gg.gg", "123");
        Person p2 = new Producer("Adam", "Testowy", "test@test.com", "www");

        Place pl1 = new Place("TTT", "Al. jerozo", true, new ArrayList<>());

        Beer beer = new Beer("Żywiec", 12.0, "LAgeR", "none", "Poslkei", "jakas", "12", "2");

        p1.addOwnedElement(pl1);
        p1.showOwnedList();

        p2.addOwnedElement(beer);
        p2.showOwnedList();
        System.out.println("_____________________________________________\n");
        System.out.println("Wielodziedziczenie");

        Wine wine = new Wine("Rossa", 18.0, "Czerwonem", "Najs", "Nice", "red");

        BeerWithWine bww = new BeerWithWine("Rossa", 18.0, "Czerwonem", "Najs", "Nice",
                "red", "wheattype", "66", "12");
        System.out.println(wine);
        System.out.println(bww);

        System.out.println("_____________________________________________\n");
        System.out.println("Overlapping"); //Bar Restaurant
        System.out.println("Wieloaspektowe");

        //Place that is high prestige bar and restaurant
        Place pl2 = new Place("TTT", "Al. jerozo", true, new ArrayList<>(), "British");
        //Place that is low prestige only restaurant
        pl2.addAlcoholToList(beer);
        System.out.println(pl2.isReservationOnly());
        Place pl3 = new Place("TTT", "Al. jerozo",2,  "British");

        //Pojawi się exception bo to nie bar
        //System.out.println(pl3.getAlcoholList());
        System.out.println(pl2);
        System.out.println(pl3);

        System.out.println("_____________________________________________\n");
        System.out.println("Dynamic"); //Bar Restaurant


        User usr = new UserStandard("Bartek", "Testowy", "bt@bt.com", "123", "Barto");
        System.out.println(usr);

        usr = new UserPremium(usr, "1233456789");
        System.out.println(usr);

        usr = new UserStandard(usr);
        System.out.println(usr);
    }
}
