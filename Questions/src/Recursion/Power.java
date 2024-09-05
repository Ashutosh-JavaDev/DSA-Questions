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
    public static void main(String[]args){
        Power ob=new Power();
        int res=ob.power(2, 5);
        System.out.println("Result: "+res);
    }
}
