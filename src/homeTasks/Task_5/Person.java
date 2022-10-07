package homeTasks.Task_5;


import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char sex;
    private int yearOfBirth;


    public Person(String name, //int age,
                   char sex) {
        this.name = name;
       // this.age = age;
        this.sex = sex;
    }

    public Person (String name, //int age,
                    char sex, int yearOfBirth) {
        this.name = name;
       // this.age = age;
        this.sex = sex;
        this.yearOfBirth = yearOfBirth;

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getName() {
        return name;
//        if (this.sex == 'M') {
//            return "Mr. " + this.name;
//        } else if (this.sex == 'F') {
//            return "Ms. " + this.name;
//        }else {
//            return this.name;
//        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
       // return age;
        return LocalDate.now().getYear() - yearOfBirth;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}