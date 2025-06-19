package ExceptionHandling;

class ExceptionCatch {
    void CatchMeathod() {
        try {
            int a = 10, b = 15;
            float c = a / b;
            System.out.println("The value of c is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }
    }
}

public class CatchingException {
 public static void main(String[] args) {
    ExceptionCatch ob = new ExceptionCatch();
    ob.CatchMeathod();
    System.out.println("Program executed successfully.");
 }
}
