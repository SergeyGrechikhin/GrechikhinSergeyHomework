package javapro.summary7homework.thread.task1;

public class Printer {
    private String document;

    public synchronized void addDocument(String doc) {
        document = doc;
        System.out.println("Документ добавлен : " + doc);
        notify();
    }

    public synchronized String printDocument() {
        try {
            System.out.println("Принтер : Жду документ");
            wait();
            System.out.println("Принтер печатает : " + document);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return document;
    }

}


