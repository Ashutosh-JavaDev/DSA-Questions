// package Recursion;
class fibo{
    void series(int num,int n,int m){
        if(num==0){
            return;
        }

        System.out.print(n+" ");
        n+=m;

        series(num-1, m, n);
    }
}
public class Fibonacci {
    public static void main(String[]args){
        fibo ob=new fibo();
        ob.series(5, 0, 1);
        System.out.println();
    }
}
