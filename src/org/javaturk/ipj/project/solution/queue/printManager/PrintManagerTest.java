package org.javaturk.ipj.project.solution.queue.printManager;

public class PrintManagerTest {

    public static void main(String[] args) {
        PrintManager pm = new PrintManager(5);
        pm.print("Document1");
        pm.print("Document2");
        pm.print("Document3");
        pm.print("Document4");
        pm.print("Document5");
    }
}
