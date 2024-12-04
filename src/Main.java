import java.util.*;

class MyClass {
    private int number;
    private String name;

    public MyClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

class NumberComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getNumber() - o2.getNumber();
    }
}

class NameComparator implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        List<MyClass> list = new ArrayList<>();
        list.add(new MyClass(3, "C"));
        list.add(new MyClass(1, "A"));
        list.add(new MyClass(2, "B"));

        System.out.println("Before sorting:");
        for (MyClass obj : list) {
            System.out.println(obj);
        }

        System.out.println("\nSorting by number:");
        Collections.sort(list, new NumberComparator());
        for (MyClass obj : list) {
            System.out.println(obj);
        }

        System.out.println("\nSorting by name:");
        Collections.sort(list, new NameComparator());
        for (MyClass obj : list) {
            System.out.println(obj);
        }


        String str = "java is fun and java is powerful";

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        for (char key : charCountMap.keySet()) {
            System.out.println(key + ": " + charCountMap.get(key));
        }


        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "C");
        originalMap.put(2, "B");
        originalMap.put(3, "A");

        Map<String, Integer> invertedMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println(invertedMap);


    }
}
