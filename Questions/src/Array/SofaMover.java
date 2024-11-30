package Array;

import java.util.*;

public class SofaMover {

    static final int[] dx = {-1, 1, 0, 0};  // Movement directions for rows (up, down)
    static final int[] dy = {0, 0, -1, 1};  // Movement directions for columns (left, right)
    
    static class State {
        int x1, y1, x2, y2; // Coordinates of the two parts of the sofa
        int steps;           // Number of steps taken

        State(int x1, int y1, int x2, int y2, int steps) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.steps = steps;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = 5;
        int N = 5;

        char[][] house = {
            {'s', 's', '0', '0', '0'},
            {'0', 'H', '0', '0', 'H'},
            {'0', 'H', '0', 'H', 'H'},
            {'0', 'H', '0', '0', 'H'},
            {'0', '0', '0', 'S', 'S'}
        };

        int startX = -1, startY = -1, endX = -1, endY = -1;

        // Find the start and end positions in the matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (house[i][j] == 's') {
                    startX = i;
                    startY = j;
                } else if (house[i][j] == 'S') {
                    endX = i;
                    endY = j;
                }
            }
        }

        // BFS initialization
        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        
        // Initial state: sofa is placed horizontally (starting from 's')
        queue.offer(new State(startX, startY, startX, startY + 1, 0));
        visited.add(startX + "," + startY + "," + startX + "," + (startY + 1));
        
        // Perform BFS
        while (!queue.isEmpty()) {
            State current = queue.poll();

            // If we reached the target state
            if ((current.x1 == endX && current.y1 == endY) || (current.x2 == endX && current.y2 == endY)) {
                System.out.println("Reached target in " + current.steps + " steps!");
                printHouse(house);
                return;
            }

            // Move the sofa in 4 directions (up, down, left, right)
            for (int i = 0; i < 4; i++) {
                int newX1 = current.x1 + dx[i];
                int newY1 = current.y1 + dy[i];
                int newX2 = current.x2 + dx[i];
                int newY2 = current.y2 + dy[i];

                // Check if the new position is within bounds and valid (empty or target)
                if (isValid(house, newX1, newY1) && isValid(house, newX2, newY2)) {
                    String newState = newX1 + "," + newY1 + "," + newX2 + "," + newY2;
                    if (!visited.contains(newState)) {
                        visited.add(newState);
                        queue.offer(new State(newX1, newY1, newX2, newY2, current.steps + 1));
                        // Print the updated state of the house at each step
                        printHouse(house, current.x1, current.y1, current.x2, current.y2, newX1, newY1, newX2, newY2);
                    }
                }
            }
        }
    }

    // Check if the cell is within bounds and is free (either 0 or S)
    static boolean isValid(char[][] house, int x, int y) {
        return x >= 0 && x < house.length && y >= 0 && y < house[0].length && (house[x][y] == '0' || house[x][y] == 'S');
    }

    // Print the current state of the house
    static void printHouse(char[][] house) {
        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house[i].length; j++) {
                System.out.print(house[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Print the updated house grid with the sofa's new position
    static void printHouse(char[][] house, int x1, int y1, int x2, int y2, int newX1, int newY1, int newX2, int newY2) {
        // Mark the previous sofa positions with '0' or other placeholder
        house[x1][y1] = '0';
        house[x2][y2] = '0';

        // Move the sofa to the new positions
        house[newX1][newY1] = 's';
        house[newX2][newY2] = 's';

        // Print the updated house grid
        printHouse(house);

        // Reset the sofa positions to the previous state for the next move
        house[x1][y1] = 's';
        house[x2][y2] = 's';
        house[newX1][newY1] = '0';
        house[newX2][newY2] = '0';
    }
}
