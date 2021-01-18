package Remhomework;

public class question43 {
    double div(int x, int y) {
        double result = 2;
        try {
            result = x / y;

        } catch (ArithmeticException e) {
            System.out.println("airthemetic exception");
            e.printStackTrace();
        }
        return result;
    }
}