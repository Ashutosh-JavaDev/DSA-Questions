package Array;

public class SumofDigit {
    public int sumofdigit(int num){
        int n=num,sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }    
    public static void main(String[]args){
        SumofDigit ob=new SumofDigit();
        int res=ob.sumofdigit(12345);   
        System.out.println(res);
    }
}
