public class Main {
    public static void main(String[] args) {
        int n = 5; // Розмірність масиву

        // Створення масиву комплексних чисел
        Complex[] complexes = new Complex[n];
        complexes[0] = new Complex(1.0, 2.0);
        complexes[1] = new Complex(2.5, 3.5);
        complexes[2] = new Complex(3.0, 4.0);
        complexes[3] = new Complex(4.5, 5.5);
        complexes[4] = new Complex(5.0, 6.0);

        // Додавання всіх комплексних чисел у масиві
        Complex sum = new Complex(0, 0);
        for (Complex complex : complexes) {
            sum = sum.add(complex);
        }
        System.out.println("Сума всіх комплексних чисел: " + sum);

        // Множення всіх комплексних чисел у масиві
        Complex product = new Complex(1, 0); // Ініціалізуємо 1, щоб почати множення
        for (Complex complex : complexes) {
            product = product.multiply(complex);
        }
        System.out.println("Добуток всіх комплексних чисел: " + product);
    }
}
