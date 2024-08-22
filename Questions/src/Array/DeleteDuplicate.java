package Array;

public class DeleteDuplicate {
    int arr[], size;

    DeleteDuplicate() {
        BasicClass ob = new BasicClass();
        this.arr = ob.getArr();
        this.size = ob.getSize();
       int newSize=size;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                   for(int k=j;k<newSize-1;k++){
                    arr[k]=arr[k+1];
                   }
                   newSize--;
                   j--;

                }
            }
        }
       
        for(int i=0;i<newSize;i++){
            System.out.print(arr[i]+" ");
        }
    
            System.out.println("Total Number of Duplicate found in array: " + (size-newSize));

    }

    public static void main(String[] args) {
        new DeleteDuplicate();
    }
}
