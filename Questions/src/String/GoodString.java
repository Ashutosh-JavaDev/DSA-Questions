package String;
import java.util.Scanner;

public class GoodString {

    // Method to calculate the distance between two characters based on their ASCII values
    private static int calculateDistance(char c1, char c2) {
        return Math.abs(c1 - c2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading good string and name
        System.out.println("Enter the String");
        String goodString = scanner.nextLine();
        String name = scanner.nextLine();

        // Start by setting the first good character as the initial 'previousGoodChar'
        char previousGoodChar = goodString.charAt(0);

        // Variable to hold the total distance
        int totalDistance = 0;

        // Process each character in the student's name
        for (char nameChar : name.toCharArray()) {
            // If the character is already in the good string, no distance is added
            if (goodString.indexOf(nameChar) != -1) {
                previousGoodChar = nameChar; // Set this as the previous good character
                continue;
            }

            // Initialize minimum distance as maximum possible, and track the closest good character
            int minDistance = Integer.MAX_VALUE;
            char closestGoodChar = previousGoodChar;

            // Search for the nearest good letter by scanning all characters in the good string
            for (char goodChar : goodString.toCharArray()) {
                int distance = calculateDistance(nameChar, goodChar);

                // If this distance is smaller, or if equal and nearer to previous good char, update closest good char
                if (distance < minDistance || 
                        (distance == minDistance && calculateDistance(previousGoodChar, goodChar) < 
                        calculateDistance(previousGoodChar, closestGoodChar))) {
                    minDistance = distance;
                    closestGoodChar = goodChar;
                }
            }

            // Add minimum distance to total distance
            totalDistance += minDistance;

            // Update previous good character for the next iteration
            previousGoodChar = closestGoodChar;
        }

        // Print the total calculated distance
        System.out.println(totalDistance);
    }
}
