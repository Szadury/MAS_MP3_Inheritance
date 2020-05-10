package com.pjwstk.MAS.Beverages;

public class Beer extends Alcohol implements IBeer{
    String wheatType;
    String IBU;
    String ABV;

    public Beer(String name, double percentage, String description, String aroma, String location, String wheatType, String IBU, String ABV) {
        super(name, percentage, description, aroma, location);
        this.wheatType = wheatType;
        this.IBU = IBU;
        this.ABV = ABV;
    }

    @Override
    public String getWheatType() {
        return wheatType;
    }

    @Override
    public void setWheatType(String wheatType) {
        this.wheatType = wheatType;
    }

    @Override
    public String getIBU() {
        return IBU;
    }

    @Override
    public void setIBU(String IBU) {
        this.IBU = IBU;
    }

    @Override
    public String getABV() {
        return ABV;
    }

    @Override
    public void setABV(String ABV) {
        this.ABV = ABV;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "wheatType='" + wheatType + '\'' +
                ", IBU='" + IBU + '\'' +
                ", ABV='" + ABV + '\'' +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", description='" + description + '\'' +
                ", aroma='" + aroma + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
