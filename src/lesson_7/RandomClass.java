package lesson_7;

public class RandomClass {
    private int a;
    private int b;
    private String c;
    private double d;

    public static class Builder {
        private RandomClass instance;

        public Builder() {
            this.instance = new RandomClass();
        }

        public Builder setA(int a) {
            instance.a = a;
            return this;
        }


        public Builder setB(int b) {
            instance.b = b;
            return this;
        }


        public Builder setC(String c) {
            instance.c = c;
            return this;
        }


        public Builder setD(double d) {
            instance.d = d;
            return this;
        }

        public RandomClass build() {
            return instance;
        }
    }
}
