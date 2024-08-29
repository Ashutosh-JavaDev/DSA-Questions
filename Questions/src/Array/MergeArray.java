package Array;

public class MergeArray {
    int arr1[][], row, col, arr2[][],third[][];

    MergeArray() {
        TwoDClass ob = new TwoDClass();
        this.arr1 = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
        TwoDClass ob2 = new TwoDClass();
        this.arr2 = ob.arr();
        this.row = ob2.getRow();
        this.col = ob2.getCol();
    }
}
