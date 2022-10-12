package oop;

public class Auto extends BaseTransport{                //Объект. Схема: Свой Класс --> Поля Private --> Конструктор -->  Геттеры и Сеттеры

    private String make; //поля
    private String model;
    private int year;

    public Auto(int wheels, int seat, String make, String model, int year) {
        super(wheels, seat);
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {    //Void потому что ничего не возвращает
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) { // Через set мы можем поменять объект
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void move() {
        System.out.println("I drive ");
    }
}
