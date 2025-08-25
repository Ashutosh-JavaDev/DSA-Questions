package Array;

public class MAXSubArray {
    public static int Sum(int[] arr){
        int sum=arr[0];
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum=Math.max(arr[i], sum);
            maxSum=Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
