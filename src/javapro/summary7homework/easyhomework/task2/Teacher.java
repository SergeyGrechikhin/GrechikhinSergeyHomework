package javapro.summary7homework.easyhomework.task2;

public class Teacher {
    public static void main(String[] args) {
          ClassRoom classRoom = new ClassRoom();
          Thread stream1 = new Thread(() -> classRoom.student("Ученик 1"));
          Thread stream2 = new Thread(() -> classRoom.student("Ученик 2"));
          Thread stream3 = new Thread(() -> classRoom.student("Ученик 3"));

          stream1.start();
          stream2.start();
          stream3.start();

          new Thread(classRoom::teacher).start();
    }

}




