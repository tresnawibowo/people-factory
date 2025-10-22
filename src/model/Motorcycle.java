package model;

public class Motorcycle implements ServiceableVehicle {
    @Override
    public void move() {
        System.out.println("Motorcycle is moving");
    }

    @Override
    public void canBeServiced() {
        System.out.println("Motorcycle can be serviced");
    }
}
