package holidayWork.generic.task8;

public class EvenFilter implements MyPredicate<Integer> {
    @Override
    public boolean test(Integer item) {
        return item % 2 == 0;
    }

}
