package holidayWork.generic.task3;

public class Pair<F , S> {
    private F first;
    private S second;



    public Pair(F first , S second){
       this.first = first;
       this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
