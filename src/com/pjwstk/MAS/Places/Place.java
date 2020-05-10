package com.pjwstk.MAS.Places;

import com.pjwstk.MAS.Beverages.Alcohol;

import java.time.LocalDate;
import java.util.*;

enum PrestigeType{Low, High};
//Overlapping with Bar and Restaurant
public class Place {
    String name;
    String address;
    PrestigeType prestigeType;
    //For high prestige places
    private boolean isReservationOnly;
    private List<LocalDate> availableReservationDates;
    //for low prestige places
    private Integer expensivenessLevel;
    private Restaurant restaurant;
    private Bar bar;

    //Place with Low Prestige and Bar
    public Place(String name, String address, Integer expensivenessLevel, List<Alcohol> alcoholList) throws Exception {
        this.name = name;
        this.address = address;
        this.prestigeType = PrestigeType.Low;
        this.expensivenessLevel = expensivenessLevel;
        this.bar = Bar.createBar(this, alcoholList);
    }

    //Place with LowPrestige and Restaurant
    public Place(String name, String address, Integer expensivenessLevel, String foodType) throws Exception {
        this.name = name;
        this.address = address;
        this.prestigeType = PrestigeType.Low;
        this.expensivenessLevel = expensivenessLevel;
        this.restaurant = Restaurant.createRestaurant(this, foodType);
    }

    //Place with LowPrestige and Bar and Restaurant
    public Place(String name, String address, Integer expensivenessLevel, List<Alcohol> alcoholList, String foodType) throws Exception {
        this.name = name;
        this.address = address;
        this.prestigeType = PrestigeType.Low;
        this.expensivenessLevel = expensivenessLevel;
        this.bar = Bar.createBar(this, alcoholList);
        this.restaurant = Restaurant.createRestaurant(this, foodType);
    }


    //Place with HighPrestige and Bar
    public Place(String name, String address, boolean isReservationOnly, List<Alcohol> alcoholList) throws Exception {
        this.name = name;
        this.address = address;
        this.prestigeType = PrestigeType.High;
        this.isReservationOnly = isReservationOnly;
        this.availableReservationDates = new ArrayList<>();
        this.bar = Bar.createBar(this, alcoholList);
    }

    //Place with HighPrestige and Restaurant
    public Place(String name, String address, boolean isReservationOnly, String foodType) throws Exception {
        this.name = name;
        this.address = address;
        this.prestigeType = PrestigeType.High;
        this.isReservationOnly = isReservationOnly;
        this.availableReservationDates = new ArrayList<>();
        this.restaurant = Restaurant.createRestaurant(this, foodType);
    }

    //Place with HighPrestige and Bar and Restaurant
    public Place(String name, String address, boolean isReservationOnly, List<Alcohol> alcoholList, String foodType) throws Exception {
        this.name = name;
        this.address = address;
        this.prestigeType = PrestigeType.High;
        this.isReservationOnly = isReservationOnly;
        this.availableReservationDates = new ArrayList<>();
        this.bar = Bar.createBar(this, alcoholList);
        this.restaurant = Restaurant.createRestaurant(this, foodType);
    }

    public boolean isReservationOnly() throws Exception {
        if(prestigeType == PrestigeType.High) {
            return isReservationOnly;
        }
        else {
            throw new Exception("This place has low prestige");
        }
    }

    public List<LocalDate> getAvailableReservationDates() throws Exception {
        if(prestigeType == PrestigeType.High) {
            return availableReservationDates;
        }
        else {
            throw new Exception("This place has low prestige");
        }
    }

    public Integer getExpensivenessLevel() throws Exception {
        if(prestigeType == PrestigeType.Low) {
            return expensivenessLevel;
        }
        else {
            throw new Exception("This place has high prestige");
        }
    }

    public List<Alcohol> getAlcoholList() throws Exception {
        if(this.bar != null){
            return bar.getAlcoholList();
        }
        else{
            throw new Exception("This place is not a bar!");
        }
    }

    public void addAlcoholToList(Alcohol alcohol) throws Exception{
        if(this.bar != null){
            bar.addAlcoholToList(alcohol);
        }
        else{
            throw new Exception("This place is not a bar!");
        }
    }

    public String getFoodType() throws Exception{
        if(this.restaurant != null){
            return restaurant.getFoodType();
        }
        else{
            throw new Exception("This place is not a restaurant!");
        }
    }

    public PrestigeType getPrestigeType() {
        return prestigeType;
    }

    public void setPrestigeType(PrestigeType prestigeType) {
        this.prestigeType = prestigeType;
    }

    @Override
    public String toString() {
        String info = "Place: " + name + ", " + address + ", "
        + prestigeType + "\n";
        if(restaurant != null){
            info += " " + restaurant.toString() + "\n";
        }
        if(bar != null){
            info += " " + bar.toString() + "\n";
        }
        return info;
    }
}
