package main;

public class ReadIPv4Address {
    public static boolean isValidIPv4Address(String ip) {
        // Split the IP address into its four decimal parts.
        String[] parts = ip.split("\\.");

        // Check that there are exactly four parts.
        if (parts.length != 4) {
            System.out.println("Input IPv4 address is: \"" + ip + "\" " + "|| False: There are not exactly four parts.");
            return false;
        }

        // Check that each part is a valid integer between 0 and 255.
        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    System.out.println("Input IPv4 address is: \"" + ip + "\" " + "|| False: The number is not between 0 and 255.");
                    return false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input IPv4 address is: \"" + ip + "\" " + "|| False: The number is not a valid integer.");
                return false;
            }
        }

        // If we got this far, the IP address is valid.
        System.out.println("Input IPv4 address is: \"" + ip + "\" " + "|| True: The IP address is valid.");
        return true;
    }
}
