package lesson_5;

import java.util.List;

public class PersonPrinter<T extends Person> {
    T person;

    public PersonPrinter(T person) {
        this.person = person;
    }

    public void print() {
        System.out.println(person.getName());
        System.out.println(person.getAge());
        if (person instanceof Worker) {
            ((Worker)person).workerMethod();
        }
    }

    void something(List<? extends T> list) {

    }
}
