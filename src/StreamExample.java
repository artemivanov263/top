import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");

        // Применяем Stream API
        List<String> result = words.stream()
                .map(String::toUpperCase) // Преобразуем в верхний регистр
                .filter(word -> word.length() > 4) // Фильтруем строки длиной больше 4 символов
                .sorted() // Сортируем по алфавиту (можно поменять на sorted(Comparator.comparingInt(String::length)))
                .collect(Collectors.toList()); // Собираем результат в новый список

        System.out.println("Результат после обработки: " + result);
    }
}
