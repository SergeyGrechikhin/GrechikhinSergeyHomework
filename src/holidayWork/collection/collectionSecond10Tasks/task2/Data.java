package holidayWork.collection.collectionSecond10Tasks.task2;

import java.util.Objects;

public class Data implements Comparable<Data> {
    @Override
    public int compareTo(Data o) {
        return this.data.compareTo(o.data);
    }


    String data ;

    public Data(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                '}';
    }
}
