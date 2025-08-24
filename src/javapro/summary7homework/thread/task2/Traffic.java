package javapro.summary7homework.thread.task2;

public class Traffic {
   private final Object lock = new Object();
   private boolean greenLight = true;

   public void carsRun(){
       synchronized (lock){
           while (!greenLight){
               try {
                   lock.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           System.out.println("Машины : зеленый - едем!" );
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           greenLight = false;
           System.out.println("Машины : красный - стоим.");
           lock.notifyAll();
       }
   }

   public void humans(){
       synchronized (lock){
           while (greenLight){
               try {
                   System.out.println("Пешеходы : жду зеленый");
                   lock.wait();
               } catch (InterruptedException e) {
               }
           }
           System.out.println("Пешеходы : зеленый - идем!");
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){
           }
           greenLight = true;
           System.out.println("Пешеходы : красный - стоим! ");
           lock.notifyAll();
       }
   }

}
