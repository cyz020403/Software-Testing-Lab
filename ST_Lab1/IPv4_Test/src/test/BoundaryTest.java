package test;
import org.junit.Test;
import static org.junit.Assert.*;
import main.ReadIPv4Address;

public class BoundaryTest {
    @Test
    public void testEmptyInput() {
        assertFalse(ReadIPv4Address.isValidIPv4Address(""));
    }

    @Test
    public void testValidIPv4Address() {
        assertTrue(ReadIPv4Address.isValidIPv4Address("192.168.0.1"));
    }

    @Test
    public void testAllZerosIPv4Address() {
        assertTrue(ReadIPv4Address.isValidIPv4Address("0.0.0.0"));
    }

    @Test
    public void testAllOnesIPv4Address() {
        assertTrue(ReadIPv4Address.isValidIPv4Address("255.255.255.255"));
    }

    @Test
    public void testNegativeNumbersIPv4Address() {
        assertFalse(ReadIPv4Address.isValidIPv4Address("-1.0.0.0"));
    }

    @Test
    public void testNumbersGreaterThan255IPv4Address() {
        assertFalse(ReadIPv4Address.isValidIPv4Address("256.0.0.0"));
    }

    @Test
    public void testMissingNumberIPv4Address() {
        assertFalse(ReadIPv4Address.isValidIPv4Address("192.168.0"));
    }

    @Test
    public void testExtraNumberIPv4Address() {
        assertFalse(ReadIPv4Address.isValidIPv4Address("192.168.0.1.1"));
    }

    @Test
    public static void main(String[] args) {
        BoundaryTest boundaryTest = new BoundaryTest();
        boundaryTest.testEmptyInput();
        boundaryTest.testValidIPv4Address();
        boundaryTest.testAllZerosIPv4Address();
        boundaryTest.testAllOnesIPv4Address();
        boundaryTest.testNegativeNumbersIPv4Address();
        boundaryTest.testNumbersGreaterThan255IPv4Address();
        boundaryTest.testMissingNumberIPv4Address();
        boundaryTest.testExtraNumberIPv4Address();
    }
}