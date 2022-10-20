package task1;
import java.util.*;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int real = scanner.nextInt();
        int imaginary = scanner.nextInt();

        System.out.println("Constructors test:\n");

        Complex c1 = new Complex(real, imaginary);
        c1.showNumber();

        Complex c2 = new Complex(c1);
        c2.showNumber();

        Complex c3 = new Complex();
        c3.showNumber();

        System.out.println("\nAddWithComplex test:\n");

        c1.addWithComplex(c2);
        c1.showNumber();

        c2.addWithComplex(c3);
        c2.showNumber();

        System.out.println("\nGetters and setters test:\n");

        System.out.println(c3.getReal() + " " + c3.getImaginary());
        c3.setReal(6);
        c3.setImaginary(-4);
        System.out.println(c3.getReal() + " " + c3.getImaginary());
    }
}
