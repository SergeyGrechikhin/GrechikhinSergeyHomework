package holidayWork.generic.task3;

import org.w3c.dom.ls.LSOutput;

public class PairDemo {
    public static void main(String[] args) {
       Pair<String, Integer> pairOne = new Pair<>("Два",2);
        System.out.println(pairOne.getFirst());
        System.out.println(pairOne.getSecond());
    }
}
