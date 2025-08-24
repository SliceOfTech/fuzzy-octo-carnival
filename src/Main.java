import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        taskintro(tasks);


    }

    public static void taskintro(ArrayList tasks) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENter a request: 1 is new task, 2 is check off the task");
        System.out.println(tasks);
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("enter task");
                tasks.add(scanner.next());
                taskintro(tasks);
            case 2:
                System.out.println("Index of task to remove");
                tasks.remove(scanner.nextInt());
                taskintro(tasks);
        }


    }
}