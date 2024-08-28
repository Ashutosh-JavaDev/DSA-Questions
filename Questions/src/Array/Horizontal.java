package Array;

public class Horizontal {
    int arr[][], row, col;

    Horizontal() {
        TwoDClass ob = new TwoDClass();
        this.arr = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == 0) {
                    System.out.print(arr[i][j] + " ");
                    sum += arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.print(sum);

    }
    public static  void  main(String[]args){
        new Horizontal();
    }
}
