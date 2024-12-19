public class DivisionExample {
    public static double divide(int numerator, int denominator) {
        return numerator / denominator; // Это может вызвать ArithmeticException
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 0)); // Попробуем разделить на 0
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль не разрешено.");
        }
    }
}
