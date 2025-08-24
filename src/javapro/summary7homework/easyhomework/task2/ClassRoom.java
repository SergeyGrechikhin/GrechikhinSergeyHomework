package javapro.summary7homework.easyhomework.task2;

public class ClassRoom {
    private Object lock = new Object();

    public void teacher(){
        synchronized (lock){
            System.out.println(" Начинаем классную работу ");
            lock.notifyAll();
        }
    }

    public void student(String name){
        synchronized (lock){
            try{
                System.out.println(name + " Ждут учителя ");
                lock.wait();
                System.out.println( name + " Начинает писать классную работу. ");
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
}
