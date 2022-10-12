package lesson7;

public abstract class BasePerson implements IDiet{
    private String name;
    private int age;
    private String diet;

    @Override
    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public BasePerson(String name, int age, String diet) throws PersonAgeException {
        this.name = name;
        if (age < 0 || age > 120) {
            throw new PersonAgeException();
        }
        this.age = age;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void hello();  // можно назвать метод абстрактным, но не задаем параметры
    // если мы наследуем абстрактный метод от абстрактного класса, то у наследников этого класса нужно расписать этот метод

    @Override
    public String toString() {
        return "BasePerson{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
