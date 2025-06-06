package homework19.ui;

import homework19.entity.Book;
import homework19.service.BookService;

import java.util.Scanner;

public class UI {
        private BookService bookService;
        Scanner input = new Scanner(System.in);

    public UI(BookService bookService) {
        this.bookService = bookService;
    }

    public void createCounterBook(){
        System.out.println("Введите сколько книг вы хотите добавить в библиотеку");
        int bookscounter = input.nextInt();
        input.nextLine();

        for (int i = 0; i < bookscounter; i++) {
            System.out.println("Введите название книги");
            String name = input.nextLine();
            System.out.println("Введите автора книги");
            String author = input.nextLine();
            System.out.println("Введите ID книги / Только цифры");
            int id = input.nextInt();
            input.nextLine();


            Book[] savedbook = bookService.addBook(id,name,author);
            if(savedbook != null){
                System.out.println("Книга добавлена " );
            } else  {
                System.out.println("Книгу добавить не получилось");
            }

        }

    }
    private void printInfoAll(){
        Book[] books = bookService.getAllBooks();
        if(books.length == 0){
            System.out.println("Библиотека пустая");

        }else {
            System.out.println("Книги в библиотеке : ");
            for (int i = 0; i < books.length; i++) {
                System.out.println(books[i]);
            }
        }

    }
    private void printInfoforFindtoId(){
        System.out.println("Введите ID по которому хотите найти книга");
        int id = input.nextInt();
        input.nextLine();
        Book foundBook = bookService.findBookById(id);
        if(foundBook != null){
            System.out.println("Ваша Книга " + foundBook);
        } else   {
            System.out.println("Ваша книга не найдена");
        }
    }
    public void userMenu(){
        while(true){
            System.out.println(" ===*Menu*=== ");
            System.out.println("1. Добавить книгу/книги в библиотеку.");
            System.out.println("2. Найти книгу в библиотеке по ID.");
            System.out.println("3. Вывести все книги в библиотеке.");
            System.out.println("0. Выйти из программы.");

            String userChoice = input.nextLine();
            switch (userChoice) {
                case "1":
                    createCounterBook();
                    break;
                    case "2":
                        printInfoforFindtoId();
                        break;
                        case "3":
                            printInfoAll();
                            break;
                            case "0":
                                System.out.println("Выход из программы");
                                return;
                default:
                    System.out.println("Вы сделали что не то!");
            }

        }
    }
}
