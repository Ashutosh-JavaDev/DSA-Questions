package CodingQuestion.TCS;

import java.util.Scanner;

class countVechile {
    public int countVechile(int twoVechicle, int fourVechile) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number of Two Wheeler Vechile");
        int two=sc.nextInt();
        System.out.println("Enter the Number of Four Wheelers Vechile");
        int four=sc.nextInt();
        count=two+four;
        return count;
    }
}

public class NumberofVechile {
    public static void main(String[]args){
        countVechile ob=new countVechile();
        int result=ob.countVechile(130, 210);
        System.out.println(result);

    }
}
