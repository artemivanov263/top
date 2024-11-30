import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private String name;
    private int priority;
    private String category;

    public Task(String name, int priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(Task o) {
        if (this.priority != o.priority) {
            return Integer.compare(this.priority, o.priority);
        } else {
            return this.category.compareTo(o.category);
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", category='" + category + '\'' +
                '}';
    }
}

class TaskManager {
    private PriorityQueue<Task> tasks = new PriorityQueue<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void printTasks() {
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Task1", 1, "Feature");
        Task task2 = new Task("Task2", 2, "Bug");
        Task task3 = new Task("Task3", 1, "Documentation");
        Task task4 = new Task("Task4", 3, "Feature");

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);

        taskManager.printTasks();
    }
}