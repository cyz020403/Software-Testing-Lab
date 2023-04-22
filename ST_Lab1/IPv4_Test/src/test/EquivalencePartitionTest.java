package test;

import main.ReadIPv4Address;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EquivalencePartitionTest {

    @Test
    public void valid() {
        System.out.println("Valid (1) (4) (8)");
        assertTrue(ReadIPv4Address.isValidIPv4Address("192.168.1.1"));
    }

    @Test
    public void testNonDotSeparatedAddress() {
        System.out.println("Invalid (2)");
        assertFalse(ReadIPv4Address.isValidIPv4Address("192,168,1,1"));
    }

    @Test
    public void testMultipleDotSeparatedAddress() {
        System.out.println("Invalid (3)");
        assertFalse(ReadIPv4Address.isValidIPv4Address("192..168.1.1"));
    }

    @Test
    public void testEmptyAddress() {
        System.out.println("Invalid (5)");
        assertFalse(ReadIPv4Address.isValidIPv4Address(""));
    }

    @Test
    public void testMoreThanFourPartsAddress() {
        System.out.println("Invalid (6)");
        assertFalse(ReadIPv4Address.isValidIPv4Address("192.168.0.1.1"));
    }

    @Test
    public void testLessThanFourPartsAddress() {
        System.out.println("Invalid (7)");
        assertFalse(ReadIPv4Address.isValidIPv4Address("192.168.1"));
    }

    @Test
    public void testNumberGreaterThan255Address() {
        System.out.println("Invalid (9)");
        assertFalse(ReadIPv4Address.isValidIPv4Address("192.168.1.256"));
    }

    @Test
    public void testNegativeNumberAddress() {
        System.out.println("Invalid (10)");
        assertFalse(ReadIPv4Address.isValidIPv4Address("192.168.1.-1"));
    }

    @Test
    public void testNonNumericPartAddress() {
        System.out.println("Invalid (11)");
        assertFalse(ReadIPv4Address.isValidIPv4Address("192.168.1.a"));
    }

    @Test
    public static void main(String[] args) {
        EquivalencePartitionTest equivalencePartitionTest = new EquivalencePartitionTest();
        equivalencePartitionTest.valid();
        equivalencePartitionTest.testNonDotSeparatedAddress();
        equivalencePartitionTest.testMultipleDotSeparatedAddress();
        equivalencePartitionTest.testEmptyAddress();
        equivalencePartitionTest.testMoreThanFourPartsAddress();
        equivalencePartitionTest.testLessThanFourPartsAddress();
        equivalencePartitionTest.testNumberGreaterThan255Address();
        equivalencePartitionTest.testNegativeNumberAddress();
        equivalencePartitionTest.testNonNumericPartAddress();
    }
}