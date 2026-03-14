package ExceptionHandling;

public class ThrowException {
    public static void main(String[] args) {
        try {
            CheckAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void CheckAge(int i) {
        if (i > 18) {
            System.out.println("eligible for voting");
        }else {
            throw new ArithmeticException("not eligible for voting");
        }

    }
}
