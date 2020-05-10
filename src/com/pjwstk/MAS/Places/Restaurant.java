package com.pjwstk.MAS.Places;

public class Restaurant{
    Place place;
    String foodType;

    private Restaurant(Place place, String foodType) {
        this.place = place;
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public static Restaurant createRestaurant(Place place, String foodType) throws Exception {
        if(place == null) {
            throw new Exception("The given whole does not exist!");
        }
        return new Restaurant(place, foodType);
    }
}
