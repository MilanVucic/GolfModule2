package lesson_5;

public class SavingType<T> {
    Class<T> myClass;

    public SavingType(Class<T> clazz) {
        myClass = clazz;
    }

    public T createNew() {
        try {
            return myClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
