package Recursion;

public class Pallindrome {
    int rev=0;
    public void check(int num){
        if(num==0){
            return;
        }
        else{
            rev=num/10;
        }
    }
}