package Array;

public class CopyArray {
    int arr[], copy[], size;

    CopyArray() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size = ob.getSize();
        copy = new int[size];
        for (int i = 0; i < size; i++) {
            copy[i] = arr[i];
        }
        System.out.println("Copied array from Array");
        for (int i = 0; i < size; i++) {
            System.out.print(copy[i]+" ");
        }
    }
    public static void main(String[]args){
        new CopyArray();
    }
}
