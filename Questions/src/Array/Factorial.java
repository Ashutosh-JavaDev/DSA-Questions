package Array;

public class Factorial {
    int fact=1;
    public int factorial(int size,int num) {
        if(size==num){
            return 0;
        }
        else{
            fact*=size;
            factorial(size, num);
        }
        return fact;
    }
}
