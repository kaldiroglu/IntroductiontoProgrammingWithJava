package org.javaturk.ipj.project.solution.queue.printManager;


import org.javaturk.ipj.project.solution.queue.Queue;

public class PrintManager {
    private Queue queue ;
    private Printer printer;

    public PrintManager(int documentCount){
        queue = new Queue(10);
        printer = new Printer();
    }

    void print(String document){
        queue.enqueue(document);
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        printer.print(queue.dequeue());
    }
}
