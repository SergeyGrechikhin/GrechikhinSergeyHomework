package holidayWork.collection.collectionFirst10Tasks;

public class Factorial {
    public static int factorial(int n){
        int result = 1;
        for (int i = 2; i <= n; i++){
            result = result * i;
        }
        return result;
    }
}
