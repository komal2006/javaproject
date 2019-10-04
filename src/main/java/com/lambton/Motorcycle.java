package com.lambton;

public class Motorcycle extends Vehicle{
    private Double distanceTravelled;

    public Motorcycle(String make, String color, String plate,Double distanceTravelled) {
        super(make, color, plate);
        this.distanceTravelled=distanceTravelled;

    }

    public Double getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(Double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }



}