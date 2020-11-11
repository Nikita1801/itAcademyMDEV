package com.company;

public class Car {
    private int stearingDiametr;
    private double corpusLenght;
    private String markName;
    private String modelName;
    private double clearenceHeight;


    public Car() {
    }

    public Car(int stearingDiametr, double corpusLenght, String markName, String modelName, double clearenceHeight) {
        this.stearingDiametr = stearingDiametr;
        this.corpusLenght = corpusLenght;
        this.markName = markName;
        this.modelName = modelName;
        this.clearenceHeight = clearenceHeight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "stearingDiametr=" + stearingDiametr +
                ", corpusLenght=" + corpusLenght +
                ", markName='" + markName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", clearenceHeight=" + clearenceHeight +
                '}';
    }
}
