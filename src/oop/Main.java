package oop;

//import static oop.Utils.*; //Можно не писать если ниже метод вызвали от класса где прописан метод класса

public class Main { //Тут все запускаем

    public static void main(String[] args) {

        Car toyota = new Car(4,5,"Toyota", "Highlander", 2022, "SUV", "White"); //Создали объект (экземпляр класса)
        Car bmw = new Car(4, 5,"Bmw", "x5", 2015, "SUV", "White");
        Car mercedes = new Car(4, 7,"Mercedes", "s600", 2002, "White", "White");
        Car nissan = new Car(4,4,"Nissan", "Murano", 1995, "Hatchback", "Black");
        Car ford = new Car(4,4,"Ford", "Explorer", 1987, "SUV", "Black");

        Airplane boeing = new Airplane(10, 250, "Regular", "Boeing");
        Camel marlboro = new Camel(2, "Marlboro");
        Camel vasily = new Camel(1, "Vasily");

        ICarrying[] array = {toyota, bmw, mercedes, nissan, ford, boeing, marlboro, vasily};
        for (ICarrying passengers : array) {
            System.out.println(((IName)passengers).getNameCarrier() + " is carrying "
                    + passengers.getNumberCarrying() + " passengers");
        }
//        toyota.setModel("rav4");
//        Car[] array = {toyota, bmw, mercedes, nissan, ford};
//        Utils.findByColor(array, "White");
//        Utils.getOldestCar(array);
//        System.out.println(toyota);



    }
}
