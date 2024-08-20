package Array;

public class CompareTwoMatrics {
    int arr1[][], arr2[][], row, col;

    CompareTwoMatrics() {

        TwoDClass ob = new TwoDClass();
        this.arr1 = ob.arr();
        this.arr2 = ob.arr();
        this.row = ob.getRow();
        this.col = ob.getCol();
        int count=0,noncount=0,roll=0;
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                if(arr1[i][j]==arr2[i][j]){
                    count++;
                    roll=col;
                }
                else{
                    noncount++;
                }
            }
        }
        if(roll==(col-1)){
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
