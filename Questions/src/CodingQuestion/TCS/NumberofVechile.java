package CodingQuestion.TCS;

import java.util.Scanner;

class countVechile {
    public int countVechile(int two, int four) {
        int count = 0;
        count = two + four;
        return count;
    }

    public int wheel(int two, int four) {
        // this.wheel(two, four);
        int vechileCount = countVechile(two, four);
        int countWheel = ((two * 2) + (four * 4));
        return countWheel;
    }
}

public class NumberofVechile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        countVechile ob = new countVechile();
        System.out.println("Enter the number of Two Wheeler Vechile");
        int two = sc.nextInt();
        System.out.println("Enter the Number of Four Wheelers Vechile");
        int four = sc.nextInt();
        int result = ob.countVechile(two, four);
        System.out.println("Total Number of Vechile: " + result);
        int res=ob.wheel(two, four);
        System.out.println("Number of Wheel: "+res);
    }
}
