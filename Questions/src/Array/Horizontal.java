package Array;

public class Horizontal {
    int arr[][], row, col;

    Horizontal() {
        TwoDClass ob = new TwoDClass();
        this.arr = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
    }
}
