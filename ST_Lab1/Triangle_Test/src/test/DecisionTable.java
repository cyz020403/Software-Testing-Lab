package test;

import main.TriangleChecker;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class DecisionTable {

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
    public void testCannotFormTriangleWithIsosceles() {
        triangleChecker.test(4, 4, 9);
    }

    @Test
    public void testEquilateralTriangle() {
        triangleChecker.test(6, 6, 6);
    }

    public static void main(String[] args) {
        DecisionTable decisionTable = new DecisionTable();
        decisionTable.testCannotFormTriangle();
        decisionTable.testGeneralTriangle();
        decisionTable.testIsoscelesTriangle();
        decisionTable.testCannotFormTriangleWithIsosceles();
        decisionTable.testEquilateralTriangle();
    }
}