package Array;

public class TwoDArray {
    int arr[][],row,col;
    TwoDArray(){
        TwoDClass ob=new TwoDClass();
        this.arr=ob.arr();
        this.row=ob.getRow();
        this.col=ob.getCol();
    }
}
