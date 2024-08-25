package Array;

public class CopyArray {
    int arr[], copy[], size;

    CopyArray() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size = ob.getSize();
        copy = new int[size];
    }
}
