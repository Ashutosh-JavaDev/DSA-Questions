package Array;
class reverse{
    void result(int arr[]){
        if(0<arr.length){
            return;
        }
        else{
            result(arr, size-1);
            System.out.println(arr[size]);
        }
    }
}
public class Reverse {
    public static void main(String[]args){
        
    }
}
