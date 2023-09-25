public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Метод для додавання комплексних чисел
    public Complex add(Complex other) {
        double newRealPart = this.realPart + other.realPart;
        double newImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    // Метод для віднімання комплексних чисел
    public Complex subtract(Complex other) {
        double newRealPart = this.realPart - other.realPart;
        double newImaginaryPart = this.imaginaryPart - other.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    // Метод для множення комплексних чисел
    public Complex multiply(Complex other) {
        double newRealPart = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double newImaginaryPart = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    // Метод для ділення комплексних чисел
    public Complex divide(Complex other) {
        double denominator = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
        double newRealPart = (this.realPart * other.realPart + this.imaginaryPart * other.imaginaryPart) / denominator;
        double newImaginaryPart = (this.imaginaryPart * other.realPart - this.realPart * other.imaginaryPart) / denominator;
        return new Complex(newRealPart, newImaginaryPart);
    }

    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}
