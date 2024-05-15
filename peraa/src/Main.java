import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        // Main menu
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Complete");
            System.out.println("3. Delete Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(description);
                    toDoList.addTask(newTask);
                    System.out.println("Task added!");
                    break;
                // Implement other cases
                case 2:
                    toDoList.completeTask();
                    break;
                case 3:
                    toDoList.removeTask();
                    break;
                case 4:
                    toDoList.printTasks();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}