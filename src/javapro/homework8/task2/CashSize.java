package javapro.homework8.task2;

import java.util.*;

public class CashSize {
    public static void main(String[] args) {
        int maxCashCSize = 4;
        List<String> cash = new ArrayList<>();
        List<String> trash = new ArrayList<>();

        Map<String, Integer> cashMap = new HashMap<>();
        cashMap.put("Cash1", 1);
        cashMap.put("Cash2", 2);
        cashMap.put("Cash3", 3);
        cashMap.put("Cash4", 4);
        cashMap.put("Cash5", 10);

        System.out.println(cashMap);

        for(String key : cashMap.keySet()){
            if (cash.size() < maxCashCSize){
                cash.add(key);
            } else {
                System.out.println("Cash is full");
            }
        }

        int lifeOfTime = 3 ;
        Iterator<String> iterator = cash.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            int life = cashMap.get(word);
            if (life < lifeOfTime){
                iterator.remove();
                trash.add(word);
            }
        }



        System.out.println("Cash : " + cash);
        System.out.println("Trash : " + trash);



    }

}
