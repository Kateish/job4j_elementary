package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(100);
        System.out.println("100 rubles are " + dollar + " dollars.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int inDoll = 110;
        int expectedDoll = 1;
        int outDoll = Converter.rubleToEuro(inDoll);
        boolean passedDoll = expectedDoll == outDoll;
        System.out.println("110 rubles are 1. Test result : " + passedDoll);

    }
}
