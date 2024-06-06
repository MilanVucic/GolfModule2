package lesson_9;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass1 = new SomeClass(55);
        SomeClass someClass2 = new SomeClass(45);
        // HEXA + DECIMAL = 6 + 10 = 16 -> base of 16 ->
        // 0,1,2,3...9,A,B,C,D,E,F
        // a8f
        // DECIMAL = 10 -> base 10 -> possible digits: 0,1,2...9
        try {
            SomeClass s3 = SomeClass.createDuplicate(someClass1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        Class c = SomeClass.class;
    }
}
