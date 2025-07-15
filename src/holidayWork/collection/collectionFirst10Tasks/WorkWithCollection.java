package holidayWork.collection.collectionFirst10Tasks;

import java.util.*;

public class WorkWithCollection {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Task 1 ");
        List<Integer> list = new ArrayList<>(List.of(59,20,45,44,32));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("==========================");
        System.out.println("Task 2 ");

        Set<String> set = new LinkedHashSet<>();
        set.add("A");
        set.add("B");
        List<String> listForRemove = new ArrayList<>(set);
        listForRemove.remove(0);
        System.out.println(listForRemove);
        System.out.println("=============================");
        System.out.println("Task 3 ");
        HashMap<Integer,  Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);
        System.out.println(map);
        System.out.println("==================");
        System.out.println("Task 4 ");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        if (set.contains("B")){
            System.out.println("Your Element Found");
        } else {
            System.out.println("Your Element Not Found");
        }
        System.out.println("=======================");
        System.out.println("Task 5 ");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Andy","Andy".length());
        treeMap.put("Bill","Bill".length());
        System.out.println(treeMap);
        System.out.println("====================");
        System.out.println("Task 6 ");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);
        pq.add(8);
        pq.add(9);
        pq.add(10);
        System.out.println(pq);
        int min = pq.poll();
        System.out.println(min);
        System.out.println("================");
        System.out.println("Task 7 ");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int target = 3 ;
        if (stack.isEmpty()){
            System.out.println("Your Stack Empty");
        }
        if (stack.contains(target)){
            int depth = stack.search(target);
            System.out.println("Your Stack Contains 3 " + depth);
        }

            System.out.println("=========================");
            System.out.println("Task 8 ");
            Deque<String> deque = new ArrayDeque<>();
            deque.addFirst("Andy");
            deque.addFirst("Bill");
            deque.addLast("Max");
            deque.addLast("Anna");
            System.out.println(deque);
            deque.pollFirst();
            deque.pollLast();
            System.out.println(deque);
            System.out.println("=======================");
            System.out.println("Task 9 ");
            TreeMap<Integer , Double > findfactorial = new TreeMap<>();
            for (int i = 1; i <= 9; i++){
                map.put(i , factorial.factorial(i));
            }

            for (Integer key : map.keySet()){
                System.out.println(key + " " + map.get(key));
            }
        System.out.println("======================");
        System.out.println("Task 10 ");
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("A");
        set1.add("B");
        LinkedList<String> linkedList1 = new LinkedList<>(set1);
        System.out.println(linkedList1);
        System.out.println("==========================");




    }


    }





