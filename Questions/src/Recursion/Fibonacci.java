package Recursion;
class fibo{
    void series(int num,int n,int m,int sum){
        if(num==0){
            return;
        }
        sum+=n;
        System.out.print(n+" ");

        series(num-1, m, sum,sum);
    }
}
public class Fibonacci {
    
}
