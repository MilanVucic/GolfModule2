package lesson_18;

@ToString(includeClassName = true, includeFieldNames = true)
public class Car {
    @ToStringIgnoreField
    private String maker;
    private String model;
    @ToStringFieldName("year of making")
    private int yearOfProduction;

    @Limit(min = 50, max = 2000)
    @ToStringFieldName("HP")
    private double horsePower;

    public Car(String maker, String model, int yearOfProduction, double horsePower) {
        this.maker = maker;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.horsePower = horsePower;
    }
}
