package Array;

public class CompareTwoMatrics {
    int arr1[][], arr2[][], row, col;

    CompareTwoMatrics() {

        TwoDClass ob = new TwoDClass();
        this.arr1 = ob.arr();
        this.arr2 = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                if(arr1[i][j]==arr2[i][j]){
                    
                }
            }
        }
    }

}
