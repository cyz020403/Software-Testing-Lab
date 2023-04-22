package test;

import main.TriangleChecker;
import org.junit.Test;

public class CauseEffectGraphing {

    TriangleChecker triangleChecker = new TriangleChecker();

    @Test
    public void testCannotFormTriangle() {
        triangleChecker.test(2, 3, 7);
    }

    @Test
    public void testGeneralTriangle() {
        triangleChecker.test(3, 4, 5);
    }

    @Test
    public void testIsoscelesTriangle() {
        triangleChecker.test(4, 4, 5);
    }

    @Test
    public void testEquilateralTriangle() {
        triangleChecker.test(6, 6, 6);
    }

    public static void main(String[] args) {
        CauseEffectGraphing causeEffectGraphing = new CauseEffectGraphing();
        causeEffectGraphing.testCannotFormTriangle();
        causeEffectGraphing.testGeneralTriangle();
        causeEffectGraphing.testIsoscelesTriangle();
        causeEffectGraphing.testEquilateralTriangle();
    }
}
