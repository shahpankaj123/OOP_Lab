package week_6;

import java.util.ArrayDeque;

public class PrinterQueue {
    public static void main(String[] args) {


        ArrayDeque<String> printQueue = new ArrayDeque<>();


        printQueue.offer("Document1");
        printQueue.offer("Document2");
        printQueue.offer("Document3");

        System.out.println("Queue after adding 3 documents: " + printQueue);


        String removedJob = printQueue.poll();
        System.out.println("Dequeued job: " + removedJob);


        printQueue.offer("Document4");
        printQueue.offer("Document5");


        String nextJob = printQueue.peek();
        System.out.println("Next job (peek): " + nextJob);


        System.out.println("Final Print Queue: " + printQueue);
    }
}
