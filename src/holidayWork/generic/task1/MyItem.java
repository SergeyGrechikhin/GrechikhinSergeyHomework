package holidayWork.generic.task1;

public class MyItem<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }
    public T get(){
        return item;
    }


}
