package javapro.homework12.task1;

public class ConverterToUpperCase {
    public static void main(String[] args) {
        ConverterInterfaceToUpperCase toUpperCase = s -> s.toUpperCase();
        String result = toUpperCase.convert("to upper case");
        System.out.println(result);

    }
}
