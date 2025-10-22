package model;

public class Car implements ServiceableVehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void canBeServiced() {
        System.out.println("Car can be serviced");
    }
}
