package Array;

public class MergeArray {
    int arr1[][], row, col, row2, col2, arr2[][], third[][];

    MergeArray() {
        TwoDClass ob = new TwoDClass();
        this.arr1 = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
        TwoDClass ob2 = new TwoDClass();
        this.arr2 = ob.arr();
        this.row2 = ob2.getRow();
        this.col2 = ob2.getCol();
        int thirdRow = row + row2;
        int thirdCol = col;

        third = new int[thirdRow][thirdCol];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                third[i][j] = arr1[i][j];

            }
        }
        //
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                third[row + i][j] = arr2[i][j]; // Potential issue here
            }
        }

        for (int i = 0; i < thirdRow; i++) {
            for (int j = 0; j < thirdCol; j++) {
                System.out.print(third[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new MergeArray();
    }
}
