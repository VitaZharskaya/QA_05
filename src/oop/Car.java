package oop;

public class Car extends Auto implements IName{ //Объект

    private String type;

    private String color;


    public Car(int wheels, int seat, String make, String model, int year, String type, String color) {
        super(wheels, seat, make, model, year);
        this.type = type;
        this.color = color;
    }

    //Через get получаем доступ значениям, типо к маркам машин Тойота и т.п.
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String getNameCarrier() {
        return getMake();
    }
}
