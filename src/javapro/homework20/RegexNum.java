package javapro.homework20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexNum {
    public static void main(String[] args) {
        String telNumber = "(+123) 1234567";
        String regex = "^\\(\\+\\d{1,3}\\)\\s\\d{7,10}$" ;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telNumber);
        System.out.println(telNumber + " / " + " is correct ? " + " " + " / " + matcher.matches());
    }
}
