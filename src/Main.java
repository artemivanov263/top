import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 4};
        System.out.println(findnum(numbers));
        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        System.out.println(findword(words));
        numbers = new int[]{10, 20, 30, 40, 50};
        int target = 35;

        int[] result = findClosestNumbers(numbers, target);

        System.out.println("Ближайшие числа: [" + result[0] + ", " + result[1] + "]");


        }


    public static Set<Integer> findnum(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }
        return numbers;
    }

    public static Set<String> findword(String[] words) {
        Set<String> word = new HashSet<>();
        for (String num : words) {
            word.add(String.valueOf(num));

        }
        return word;
    }

    public static int[] findClosestNumbers(int[] array, int target) {
        TreeSet<Integer> set = new TreeSet<>();

        // Добавляем все элементы массива в TreeSet
        for (int num : array) {
            set.add(num);
        }

        // Находим ближайший меньший элемент
        Integer lower = set.floor(target);
        // Находим ближайший больший элемент
        Integer higher = set.ceiling(target);

        // Если нет ни одного подходящего элемента, возвращаем null
        if (lower == null || higher == null) {
            return null;
        }

        // Возвращаем результат в виде массива
        return new int[]{lower, higher};
    }
}










