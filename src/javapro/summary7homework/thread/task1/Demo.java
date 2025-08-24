package javapro.summary7homework.thread.task1;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();
        Thread printerThread = new Thread(printer::printDocument);
        Thread userThread = new Thread(() -> printer.addDocument("Документ 1"));

        printerThread.start();
        Thread.sleep(1000);
        userThread.start();

    }
}
