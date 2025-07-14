package holidayWork.generic.task7;

public class Optional<T> {
    private T value;

    private Optional(T value) {
        this.value = value;
    }

    public static <T> Optional<T> of(T value) {
        return new Optional<T>(value);
    }

    public static <T> Optional<T> empty() {
        return new Optional<T>(null);
    }

    public boolean isPresent() {
        return value != null;
    }
    public T get() {
        return value;
    }

    public T orElse(T defaultValue) {
        if (value == null) {
            return value;
        } else  {
            return defaultValue;
        }
    }
}
