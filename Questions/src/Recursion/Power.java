package Recursion;
public class Power {
    public int power(int number,int pow){

        int result=1;
        if(pow<1){
            return 0;
        }
        else{
            result*=number;
            power(number, pow-1);
        }
        return result;
    }
}
