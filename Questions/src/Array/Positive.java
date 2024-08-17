package Array;

public class Positive {
    int arr[];
    int size;

    Positive() {

        BasicClass ob=new BasicClass();
        this.arr = ob.getArr();
        this.size = size;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Positive();
    }
}
