package Array;

import java.util.Scanner;

public class TwoDClass {
    int arr[][], row, col;

    TwoDClass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Row");
        row = sc.nextInt();
        System.out.println("Enter the size of Column");
        col = sc.nextInt();
        arr = new int[row][col];
        System.out.println("Enter the value in the Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public int[][] arr(){
        return arr;
    }
}
