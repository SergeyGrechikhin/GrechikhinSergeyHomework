package javapro.homework12.task3;

public class Palindrome {
    public static void main(String[] args) {
        PalindromeInterface palindrome = s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        System.out.println(palindrome.isPalindrome("шалаш"));
        System.out.println(palindrome.isPalindrome("огонь"));
    }
}
