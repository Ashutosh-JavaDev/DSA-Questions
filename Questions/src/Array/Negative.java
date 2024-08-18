package Array;

public class Negative {
    int arr[], size;

    Negative() {
        BasicClass ob = new BasicClass();
        this.arr=ob.getArr();
        this.size=ob.getSize();
        System.out.print("Negative Number are: ");
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                System.out.print(arr[i]);
            }
        }
    }
}
