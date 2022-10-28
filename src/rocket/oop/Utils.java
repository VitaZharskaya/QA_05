package rocket.oop;

public class Utils { //Создаем все методы тут

    public static void findByColor(Car[] array, String color) { //тут статик как и в иморт статик в Main
        for (int i = 0; i < array.length; i++) {
            if (color.equals(array[i].getColor())) {
                System.out.println(array[i].getModel());
            }
        }
    }

    public static void getOldestCar(Car[] array) {
        Car min = array[0];
        for (Car carElement : array) {
            if (min.getYear() > carElement.getYear()) { //К году можем обратиться через getYear
                min = carElement;
            }
        }
//        System.out.println(min.getMake() + " " + min.getYear());
        System.out.println(min.toString());
    }

}
