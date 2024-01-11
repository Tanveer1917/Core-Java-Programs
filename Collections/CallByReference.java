package com.Collections;

public class CallByReference {
    private String name;
    private String destination;
    private int number;
    private String source;

    public CallByReference(String name, String destination, int number, String source) {
        this.name = name;
        this.destination = destination;
        this.number = number;
        this.source = source;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", number=" + number +
                ", source='" + source + '\'' +
                '}';
    }

    public static void modifyTrain(CallByReference train) {
        // Modifying the train inside the method
        train.setNumber(train.getNumber() + 100);
        train.setSource("New Source");
        // Note: The changes made to the train inside this method will affect the original train
    }

    public static void main(String[] args) {
        CallByReference myTrain = new CallByReference("Express", "City", 123, "Station");

        System.out.println("Before modifying the train:");
        System.out.println(myTrain);

        modifyTrain(myTrain);

        System.out.println("After modifying the train:");
        System.out.println(myTrain);
    }
}
