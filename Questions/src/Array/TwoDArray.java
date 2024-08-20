package Array;

import java.io.IOException;

public class TwoDArray {
    int arr[][], row, col;

    TwoDArray() {
        TwoDClass ob = new TwoDClass();
        this.arr = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
        System.out.println("Two D Array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();

        }
    }

    public static void main(String[] args) throws IOException {
        new TwoDArray();
    }
}
