package CodingQuestion.TCS;

import java.util.Scanner;

class countVechile {
    public int countVechile(int two, int four) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number of Two Wheeler Vechile");
        two = sc.nextInt();
        System.out.println("Enter the Number of Four Wheelers Vechile");
        four = sc.nextInt();
        count = two + four;
        return count;
    }
}

public class NumberofVechile {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        countVechile ob=new countVechile();
        int result=ob.countVechile(sc.nextInt(),sc.nextInt());
        System.out.println(result);

    }
}
