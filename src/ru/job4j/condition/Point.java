package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double lengthX = x2 - x1;
        double first = Math.pow(lengthX, 2);
        double lengthY = y2 - y1;
        double second = Math.pow(lengthY, 2);
        double rsl = Math.sqrt(first + second);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(0, -1, 2, 800);
        System.out.println("result (0, -1) to (2, 800) " + result1);
    }
}
