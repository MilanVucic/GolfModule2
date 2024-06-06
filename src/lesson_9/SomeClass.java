package lesson_9;

public class SomeClass implements Cloneable{
    private int a;

    public SomeClass(int a) {
        this.a = a;
    }

    public static SomeClass createDuplicate(SomeClass someClass) throws CloneNotSupportedException {
        return (SomeClass) someClass.clone();
    }

    // 100,000 / 26 ~ 3.5k -> 200
    // Harry Poter -> H -> Fiction -> JKR
    // QXY
    // SA, SU, SC, SH

    // 9558, 8743, 4885, 8384, 9394
    // 9 -> 9558, 9823
    // 8 -> 8231, 8434
    // 18237162367
    // 38747635487

    protected void something() {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SomeClass other) {
            return this.a == other.a;
        }
        return false;
    }
//
//    @Override
//    public String toString() {
//        return "SomeClass, a = " + a;
//    }
}
