import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Иван", "Петр", "Сергей", "Алексей", "Мария");

        // 1. Сортировка с помощью анонимного класса
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name2.compareTo(name1); // Сравниваем в обратном порядке
            }
        });
        System.out.println("Список имен в обратном порядке (анонимный класс): " + names);

        // 2. Сортировка с помощью лямбда-выражения
        names = Arrays.asList("Иван", "Петр", "Сергей", "Алексей", "Мария"); // Восстанавливаем исходный список
        names.sort((name1, name2) -> name2.compareTo(name1));
        System.out.println("Список имен в обратном порядке (лямбда): " + names);
    }
}
