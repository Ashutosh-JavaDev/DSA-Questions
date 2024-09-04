package Array;

public class SumofDigit {
    public int sumofdigit(int num){
        int n=num,sum=0;
        while(num>=0){
            sum+=num/10;
            num=num%10;
        }
        return sum;
    }    
}
