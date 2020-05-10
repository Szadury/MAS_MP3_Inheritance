package com.pjwstk.MAS.Beverages;


public class Alcohol {
    String name;
    double percentage;
    String description;
    String aroma;
    String location;

    public Alcohol(String name, double percentage, String description, String aroma, String location) {
        this.name = name;
        this.percentage = percentage;
        this.description = description;
        this.aroma = aroma;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "name='" + name + '\'' +
                ", percentage=" + percentage +
                ", description='" + description + '\'' +
                ", aroma='" + aroma + '\'' +
                '}';
    }
}
