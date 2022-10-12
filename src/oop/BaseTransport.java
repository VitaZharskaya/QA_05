package oop;

public abstract class BaseTransport implements ICarrying {

    private int wheels;

    private int seat;

    public BaseTransport(int wheels, int seat) {
        this.wheels = wheels;
        this.seat = seat;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeat() {
        return seat;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public abstract void move();


    @Override
    public int getNumberCarrying() {
        return seat;
    }

}
