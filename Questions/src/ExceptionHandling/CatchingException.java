package ExceptionHandling;

class ExceptionCatch {
    void CatchMeathod() {
        try {
            int a = 10, b = 20;
            int c = a / b;
            System.out.println("The value of c is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }
    }
}

public class CatchingException {

}
