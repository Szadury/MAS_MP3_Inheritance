package com.pjwstk.MAS.Beverages;

public class BeerWithWine extends Wine implements IBeer{
    String wheatType;
    String IBU;
    String ABV;

    public BeerWithWine(String name, double percentage, String description, String aroma, String location, String grapeType, String wheatType, String IBU, String ABV) {
        super(name, percentage, description, aroma, location, grapeType);
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
    public String  toString() {
        return "BeerWithWine{" +
                "wheatType='" + wheatType + '\'' +
                ", IBU='" + IBU + '\'' +
                ", ABV='" + ABV + '\'' +
                ", grapeType='" + grapeType + '\'' +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", description='" + description + '\'' +
                ", aroma='" + aroma + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
