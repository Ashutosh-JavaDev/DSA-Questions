package Array;

public class DiagonalMatrix {
    int arr[][], row, col;

    DiagonalMatrix() {
        TwoDClass ob = new TwoDClass();
        this.arr = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }

        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

    }
}
