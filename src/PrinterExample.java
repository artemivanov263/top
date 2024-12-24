
// Создаем интерфейс Printer
interface Printer {
    void print(String message);
}

public class PrinterExample {
    public static void main(String[] args) {
        // 1. Реализация с помощью анонимного класса
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer.print("Это сообщение из анонимного класса.");

        // 2. Реализация с помощью лямбда-выражения
        Printer lambdaPrinter = (message) -> System.out.println(message);
        lambdaPrinter.print("Это сообщение из лямбда-выражения.");

        // 3. Измененная реализация с помощью лямбда-выражения
        Printer lengthPrinter = (message) -> {
            System.out.println(message);
            System.out.println("Длина сообщения - " + message.length());
        };
        lengthPrinter.print("Это сообщение с длиной.");
    }
}



