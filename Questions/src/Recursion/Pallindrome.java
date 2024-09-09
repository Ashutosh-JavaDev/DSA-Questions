package Recursion;

public class Pallindrome {
    int rev=0;
    public void check(int num){
        if(num==0){
            return;
        }
        else{
            rev=num%10;
            check(num/10);
        }
    }
    public static void main(String[]args){
        Pallindrome  ob=new Pallindrome();
    }
}