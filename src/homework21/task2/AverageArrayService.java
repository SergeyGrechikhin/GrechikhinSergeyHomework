package homework21.task2;

public class AverageArrayService {
    int[] myarray = {5,5,10};
    public double myAverage(){
        if (myarray.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < myarray.length; i++) {
            sum += myarray[i];
        }
        double average = sum / myarray.length;
        return average;
    }
}
