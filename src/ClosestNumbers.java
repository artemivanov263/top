import java.util.TreeSet;

public class ClosestNumbers {
    public static int[] findClosestNumbers(int[] numbers, int target) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int number : numbers) {
            treeSet.add(number);
        }

        int smaller = treeSet.lower(target);
        int larger = treeSet.higher(target);

        return new int[] {smaller, larger};
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 35;
        int[] result = findClosestNumbers(numbers, target);
        System.out.println(result[0] + " " + result[1]); // Вывод: 30 40
    }
}
