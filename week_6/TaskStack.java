package week_6;

import java.util.Stack;

public class TaskStack {
    public static void main(String[] args) {


        Stack<String> tasks = new Stack<>();

        tasks.push("Read");
        tasks.push("Write");
        tasks.push("Code");

        System.out.println("Stack after initial pushes: " + tasks);


        String removedTask = tasks.pop();
        System.out.println("Popped task: " + removedTask);


        tasks.push("Debug");
        tasks.push("Test");


        String topTask = tasks.peek();
        System.out.println("Top task (peek): " + topTask);


        System.out.println("Final Stack: " + tasks);
    }
}
