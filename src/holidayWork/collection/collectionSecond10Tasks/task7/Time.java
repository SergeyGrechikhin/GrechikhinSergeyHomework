package holidayWork.collection.collectionSecond10Tasks.task7;

import java.util.Objects;

public class Time implements Comparable<Time>{
    private int timehour ;
    private int timeminute ;

    public Time(int timehour, int timeminute) {
        this.timehour = timehour;
        this.timeminute = timeminute;
    }

    public int getTimehour() {
        return timehour;
    }

    public int getTimeminute() {
        return timeminute;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return timehour == time.timehour && timeminute == time.timeminute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timehour, timeminute);
    }

    @Override
    public String toString() {
        return "time{" +
                "timehour=" + timehour +
                ", timeminute=" + timeminute +
                '}';
    }

    @Override
    public int compareTo(Time o) {
        int result = Integer.compare(this.timehour, o.timehour);
        if(result == 0){
            result = Integer.compare(this.timeminute, o.timeminute);
        }
        return result;
    }
}
