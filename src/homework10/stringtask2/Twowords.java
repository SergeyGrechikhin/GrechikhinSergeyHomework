package homework10.stringtask2;

import java.util.Scanner;

public class Twowords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введи первое слово");
        String word1 = scanner.nextLine() ;
        System.out.println("Введи второе слово");
        String word2 = scanner.nextLine() ;
        String cutword1 = word1.substring(0,word1.length() / 2) ;
        String cutword2 = word2.substring(word2.length() - word2.length() / 2)  ;
        System.out.println(" Твое новое слово : " + cutword1+cutword2);

    }
}
