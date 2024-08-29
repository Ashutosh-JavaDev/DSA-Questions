package Array;

public class MergeArray {
    int arr1[][], row, col, arr2[][], third[][];

    MergeArray() {
        TwoDClass ob = new TwoDClass();
        this.arr1 = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
        TwoDClass ob2 = new TwoDClass();
        this.arr2 = ob.arr();
        this.row = ob2.getRow();
        this.col = ob2.getCol();
        int thirdRow = ob.getRow() + ob2.getRow();
        int thirdCol = ob.getCol() + ob2.getCol();

        third = new int[thirdRow][thirdCol];
        for (int i = 0; i < thirdRow; i++) {
            for (int j = 0; j < thirdCol; j++) {
                System.out.print(ob.arr[i][j]+" ");
                System.out.print(ob2.arr[i][j]+" ");
            }
        }
        System.out.print("\b"); 
        System.out.println();
    }
    public static void main(String[]args){
        new MergeArray();
    }
}
