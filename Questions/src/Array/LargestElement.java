package Array;

public class LargestElement {
    int arr[], size;

    int LargestElement() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size = ob.getSize();
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[0] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
       LargestElement ob= new LargestElement();
       int result=ob.LargestElement();
       System.out.println("Maximum Number in the Array: "+result);
    }
}
