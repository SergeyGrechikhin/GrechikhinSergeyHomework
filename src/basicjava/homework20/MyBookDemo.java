package basicjava.homework20;

import java.util.Scanner;

public class MyBookDemo {
    public static void main(String[] args) {
        System.out.println("Введите сколько книг должно быть в библиотеке ");
        Scanner sc = new Scanner(System.in);
        int librarySize = sc.nextInt();
        sc.nextLine();
        BookRepository bookRepository = new BookRepository(librarySize);
        BookService bookService = new BookService(bookRepository);
        UI ui = new UI(bookService);
        ui.menu();
    }
}
