package lesson_7;

public class Child extends Parent {
    public int a;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Child c) {
            return c.a == this.a && c.name.equals(this.name);
        }
        return false;
    }
}
