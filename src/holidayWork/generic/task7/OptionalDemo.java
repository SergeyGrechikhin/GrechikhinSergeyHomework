package holidayWork.generic.task7;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        System.out.println("Присутствует " + optional.isPresent());
        System.out.println("Значение " + optional.get());
        System.out.println("Значение или другое " + optional.orElse("World"));

    }
}
