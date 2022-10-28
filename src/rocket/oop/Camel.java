package rocket.oop;

public class Camel implements ICarrying, IName{

    private String name;
    private int numberOfCarryingPeople;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Camel(int carryingPeople, String name) {
        this.numberOfCarryingPeople = carryingPeople;
        this.name = name;
    }

    public int getCarryingPeople() {
        return numberOfCarryingPeople;
    }

    public void setCarryingPeople(int carryingPeople) {
        this.numberOfCarryingPeople = carryingPeople;
    }

    @Override
    public int getNumberCarrying() {
        return numberOfCarryingPeople;
    }

    @Override
    public String getNameCarrier() {
        return name;
    }
}
