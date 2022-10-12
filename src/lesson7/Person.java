package lesson7;

import java.io.IOException;
import java.nio.CharBuffer;

public class Person extends BasePerson implements Runnable, Readable{

    public Person(String name, int age, String diet) throws PersonAgeException {
        super(name, age, diet);
    }

    @Override
    public void hello() {
        System.out.println("Hello, I am Person");
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }

    @Override
    public void run() {
// если правильно написать метод Run, то класс будет выполнять интерфейс runnable
    }
}
