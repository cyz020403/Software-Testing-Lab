package main;

public class TriangleChecker {
    public void test(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("a = " + a + ", b = " + b + ", c = " + c + " || 三角形是等边三角形");
            } else if (a == b || a == c || b == c) {
                System.out.println("a = " + a + ", b = " + b + ", c = " + c + " || 三角形是等腰三角形");
            } else {
                System.out.println("a = " + a + ", b = " + b + ", c = " + c + " || 三角形是一般三角形");
            }
        } else {
            System.out.println("a = " + a + ", b = " + b + ", c = " + c + " || 不能构成三角形");
        }
    }

    public static void main(String[] args) {
        TriangleChecker triangleChecker = new TriangleChecker();
        triangleChecker.test(3, 4, 5);
    }
}
