package Array;
class reverse{
    void result(int arr[],int size){
        if(size==-1){
            return;
        }
        else{
            System.out.println(arr[size]);

            result(arr, size-1);
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
