package javapro.homework21.task1;

public class HelloTreadDemo {
    public static void main(String[] args) {

        var stream1 = new HelloTreadExt("Hallo Stream 1");
        var stream2 = new HelloTreadRun("Hallo Stream 2");

        stream1.start();
        stream2.run();



    }
}
