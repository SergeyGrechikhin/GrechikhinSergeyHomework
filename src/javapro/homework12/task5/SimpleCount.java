package javapro.homework12.task5;

public class SimpleCount {
    public static void main(String[] args) {
        SimpleCountInterface simpleCountInterface = intForCheck -> {
            int forCheck = 0 ;
            for (int i = 2; i <= intForCheck; i++) {
                if (intForCheck % i == 0) {
                    forCheck++;
                }
            }
            return forCheck;
        };

        int result = simpleCountInterface.SimpleCount(14);
        if (result > 1) {
            System.out.println( "Count not Simple");
        } else  {
            System.out.println("Count Simple");
        }

    }
}
