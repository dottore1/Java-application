package com.BrewMES.demo.model;

public class Machine {
    private int id;
    private String ip;
    private Batch currentBatch;
    private double oee;
    private int currentState;
    private int totalProducts;
    private int acceptableProducts;
    private int defectProducts;
    private double temperature;
    private double vibration;
    private double humidity;

    public void controlMachine(Command command) {
        throw new UnsupportedOperationException();
    }

    public int readState() {
        throw new UnsupportedOperationException();
    }

    public double READALLTHESTUFFSS() {
        throw new UnsupportedOperationException();
        //TODO: THIS NEEDS TO BE ALOT OF METHODS THAT GETS STUFF FROM THE MACHINE
    }

    private void saveBatch() {
        throw new UnsupportedOperationException();
    }

    private double calculateOEE() {
        throw new UnsupportedOperationException();
    }

    public void setVariables(int speed, BeerType beerType, int batchSize) {
        throw new UnsupportedOperationException();
    }

    public String makeJsonVariables() {
        throw new UnsupportedOperationException();
    }

}
