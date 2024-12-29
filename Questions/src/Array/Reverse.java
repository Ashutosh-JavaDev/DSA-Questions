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
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        reverse ob=new reverse();
        ob.result(arr, arr.length-1);
    }
}
