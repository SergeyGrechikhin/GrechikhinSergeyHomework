package holidayWork.generic.task9;

import java.util.ArrayList;
import java.util.List;

public class MyKeys <K , V>{
    private final List<K> keys = new ArrayList<>();
    private final List<V> values = new ArrayList<>();

    public void put(K key, V value){
        int index = keys.indexOf(key);
        if(index >= 0 ){
            values.set(index ,value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K key){
        int index = keys.indexOf(key);
        if(index >= 0){
            return values.get(index);
        }
        return null;
    }

    public void remove(K key){
        int index = keys.indexOf(key);
        if(index >= 0){
            keys.remove(index);
            values.remove(index);
        }
    }
}
