package lesson7;

public class Dog implements IDiet{ // класс Dog имплементируют класс IDiet

    private String name;
    private String diet = "bones";

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String diet) {
        this.name = name;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
