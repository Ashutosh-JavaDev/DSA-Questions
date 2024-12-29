package Array;
class reverse{
    void result(int arr[],int size){
        if(0<size){
            return;
        }
        else{
            result(arr, size-1);
            System.out.println(arr[size]);
        }
    }
}
public class Reverse {
    
}
