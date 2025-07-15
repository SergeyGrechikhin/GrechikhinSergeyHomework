package holidayWork.collection.collectionSecond10Tasks.task6;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        int result = Integer.compare(this.x, o.x);
        if(result == 0){
            result =  Integer.compare(this.y, o.y);
        }
        return result;

    }

}
