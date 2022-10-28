package rocket.oop;

public class Airplane extends BaseTransport implements IName{

    private String name;
    private String typeOfWings;

    public Airplane(int wheels, int seat, String typeOfWings, String name) {
        super(wheels, seat);
        this.typeOfWings = typeOfWings;
        this.name = name;
    }

    public String getTypeOfWings() {
        return typeOfWings;
    }

    public void setTypeOfWings(String typeOfWings) {
        this.typeOfWings = typeOfWings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("I fly ");
    }

    @Override
    public String getNameCarrier() {
        return name;
    }
}
