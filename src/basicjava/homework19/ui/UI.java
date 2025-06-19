package basicjava.homework19.ui;

import basicjava.homework19.entity.Book;
import basicjava.homework19.service.BookService;

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

    private void printInfoforFindtoId(){
        System.out.println("Введите ID по которому хотите найти книга");
        int id = input.nextInt();
        input.nextLine();
        Book foundIdBook = bookService.findBookById(id);
        if(foundIdBook != null){
            System.out.println("Ваша Книга " + foundIdBook);
        } else   {
            System.out.println("Ваша книга не найдена");
        }
    }





    private void printInfoforFindbyAuthorBooks(){
        System.out.println("Введите автора книги которую хотите найти");
        String author = input.nextLine();
        Book[] foundAuthorBook = bookService.findAllBooksByAuthor(author);
        if(foundAuthorBook.length == 0){
            System.out.println("Книги автора " +  author  + " не найдены");
        } else {
            System.out.println("Книги автора " +  author  +  " : " );
            for (int i = 0; i < foundAuthorBook.length ; i++) {
                System.out.println(" - " + foundAuthorBook[i]);
            }
        }
    }

    private void printInfoforFindbyNameBooks(){
        System.out.println("Введите название книги которую хотите найти");
        String booksname = input.nextLine();
        Book[] foundNameBook = bookService.findAllBooksByName(booksname);
        if(foundNameBook.length == 0){
            System.out.println("Книги c названием " +  booksname  + " не найдены");
        } else {
            System.out.println("Книги с названием " +
                    " " +  booksname  +  " : " );
            for (int i = 0; i < foundNameBook.length ; i++) {
                System.out.println(" - " + foundNameBook[i]);
            }
        }
    }
    public void printInfo() {
        Book[] books = bookService.getAllBooks();
        if ( books.length == 0) {
            System.out.println("Книги ещё не добавлены в катaлог");
            return;
        }
        System.out.println(" Информация : ") ;
        for (int i = 0; i < books.length ; i++) {
            if (books[i] == null) {
                return;
            }
            System.out.println( " \n---- " + "\nНазвание книги : " + books[i].getNamebook() + "  " + "\nИмя Автора : " + books[i].getAuthor() + "\nID : " + books[i].getId());
        }
    }


    public void userMenu(){
        while(true){
            System.out.println(" ===*Menu*=== ");
            System.out.println("1. Добавить книгу/книги в библиотеку.");
            System.out.println("2. Найти книгу в библиотеке ");
            System.out.println("3. Вывести все книги в библиотеке.");
            System.out.println("0. Выйти из программы.");

            String userChoice = input.nextLine();
            switch (userChoice) {
                case "1":
                    createCounterBook();
                    break;

                    case "2":
                        while (true) {
                                System.out.println("\n===*Поиск Книг*===");
                                System.out.println("1. Найти книгу по ID");
                                System.out.println("2. Найти книгу по автору");
                                System.out.println("3. Найти книгу по названию");
                                System.out.println("0. Вернуться в основное меню");
                                String userСhoiceExtra = input.nextLine();
                                switch (userСhoiceExtra) {
                                    case "1":
                                        printInfoforFindtoId();
                                        break;
                                    case "2":
                                        printInfoforFindbyAuthorBooks();
                                        break;
                                    case "3":
                                        printInfoforFindbyNameBooks();
                                        break;
                                    case "0":
                                        System.out.println("Возврат в главное меню");
                                        break;
                                    default:
                                        System.out.println("Вы сделали что не так !");
                                }
                                if (userСhoiceExtra.equals("0")) {
                                    break;
                                }
                            }
                            break;


                        case "3":
                            printInfo();
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
