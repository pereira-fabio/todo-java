import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<Task> tasks;
    Scanner scanner = new Scanner(System.in);
    public ToDoList() {
        this.tasks = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }
    public void addTask(Task task) {
        tasks.add(task);
    }


    public int validID(){
        int taskID;
        do{
            System.out.print("Enter the task ID: ");
            taskID = scanner.nextInt();
            if(taskID < 0 || taskID > tasks.size()){
                System.out.println("Invalid task ID. Please try again.");
            }
        }while (taskID < 0 || taskID > tasks.size());
        return taskID;
    }
    public void completeTask(){
        printTasks();
        int validID = validID();
        if (!tasks.get(validID).isCompleted()){
            tasks.get(validID).setCompleted(true);
            System.out.println("Task is now completed.");
            printTasks();
        }else{
            System.out.println("Task is already completed.");
        }
    }

    public void removeTask(){
        int taskID;
        printTasks();
        tasks.remove(validID());
    }

    public String printTasks(){
        String stTask = "";
        for (int i = 0; i < tasks.size(); i++) {
            stTask = stTask + i +") "+ tasks.get(i).getDescription() + " " + tasks.get(i).isCompleted() + "\n";
        }
        System.out.println(stTask);
        return stTask;
    }

}
