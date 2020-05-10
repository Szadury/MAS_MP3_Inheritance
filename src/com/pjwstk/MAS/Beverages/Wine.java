package com.pjwstk.MAS.Beverages;

public class Wine extends Alcohol{
    String grapeType;

    public Wine(String name, double percentage, String description, String aroma, String location, String grapeType) {
        super(name, percentage, description, aroma, location);
        this.grapeType = grapeType;
    }


    public String getGrapeType() {
        return grapeType;
    }

    public void setGrapeType(String grapeType) {
        this.grapeType = grapeType;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "grapeType='" + grapeType + '\'' +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", description='" + description + '\'' +
                ", aroma='" + aroma + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
