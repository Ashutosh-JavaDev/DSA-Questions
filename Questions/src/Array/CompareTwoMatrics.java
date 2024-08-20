package Array;

public class CompareTwoMatrics {
    int arr1[][], arr2[][], row, col;

    CompareTwoMatrics() {

        TwoDClass ob = new TwoDClass();
        this.arr1 = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
        System.out.println("Enter the value in Second Matrics");
        TwoDClass ob2=new TwoDClass();
        this.arr2 = ob2.arr();
        boolean areEqual=true;
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    areEqual=false;
                    break;
                }
               if(!areEqual){
                break;
               }
            }
        }
        if(areEqual){
            System.out.println("Both Matrics are same");
        }
        else{
            System.out.println("Matrics are not same");
        }
    }
    public static void main(String[]args){
        new CompareTwoMatrics();
    }
}
