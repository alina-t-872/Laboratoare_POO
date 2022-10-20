package task1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        new Complex(0, 0);
    }

    public Complex(Complex nr) {
        this.real = nr.real;
        this.imaginary = nr.imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex nr) {
        this.real += nr.real;
        this.imaginary += nr.imaginary;
    }

    public void showNumber() {
        if (imaginary > 0)
            System.out.println(real + " + i * " + imaginary);
        else if (imaginary < 0) {
            System.out.println(real + " - i * " + Math.abs(imaginary));
        } else {
            System.out.println(real);
        }
    }
}
