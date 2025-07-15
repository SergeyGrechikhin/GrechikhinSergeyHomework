package holidayWork.collection.collectionSecond10Tasks.task6;

import holidayWork.collection.collectionSecond10Tasks.task5.Book;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class PointDemo {
    public static void main(String[] args) {
        TreeSet<Point> map = new TreeSet<>();
        map.add(new Point(7,2));
        map.add(new Point(8,4));
        map.add(new Point(5,6));

        for(Point p:map){
            if (p.getX() > p.getY()){
                System.out.println(p);
            }
        }


    }
}
