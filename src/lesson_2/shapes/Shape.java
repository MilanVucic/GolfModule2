package lesson_2.shapes;

public abstract class Shape {
    private static int NEXT_ID = 1;

    private String color; // #aa1bb3 -> RGB
    private int uniqueID;

    public Shape(String color) {
        this.color = color;
        uniqueID = NEXT_ID++;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract double getCircumference();

    @Override
    public String toString() {
        return String.format("%s %s (%d)\nArea: %.2f\nCircumference: %.2f",
                color, getClass().getSimpleName(), uniqueID, getArea(), getCircumference());
    }
}
