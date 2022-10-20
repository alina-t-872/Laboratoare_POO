package task1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(Complex number) {
        this.real = number.real;
        this.imaginary = number.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    void addWithComplex(Complex number) {
        this.real += number.real;
        this.imaginary += number.imaginary;;
    }

    void showNumber() {
        if (imaginary > 0)
            System.out.println(real + " + i * " + imaginary);
        else if (imaginary < 0)
            System.out.println(real + " - i * " + (-1) * imaginary);
        else
            System.out.println(real);
    }
}
