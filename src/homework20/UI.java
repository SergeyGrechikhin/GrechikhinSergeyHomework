package homework20;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UI {
    private BookService bookService;
    Scanner input = new Scanner(System.in);

    public UI(BookService bookService) {
        this.bookService = bookService;
    }
    public void createBook(){
        System.out.println("Введите сколько книг вы хотите добавить в библиотеку ");
        int bookscounter = input.nextInt();
        input.nextLine();
        for (int i = 0; i < bookscounter; i++) {
            System.out.println(" Введите название книги ");
            String namebook = input.nextLine();
            System.out.println("Введите автора книги");
            String authorbook = input.nextLine();
            System.out.println("Введите ID книги");
            String id = input.nextLine();

            Book newBook = new Book(id,namebook,authorbook);
            boolean addNewBook = bookService.addNewBook(newBook);

            if (addNewBook) {
                System.out.println("Книга добавлена ");
            }else {
                System.out.println("Книга не добавлена ");
            }
        }
    }
    private void printInfoforFindtoId(){
        System.out.println("Введите ID книги которую хотите найти");
        String idbook = input.nextLine();
        Book foundBook = bookService.findBookById(idbook);
        if (foundBook != null) {
            System.out.println("Ваша книга" + foundBook);
        } else {
            System.out.println("Книга с таким ID не найдена");
        }
    }

    private void printInfoforFindbyName(){
        System.out.println("Введите название книги которую хотите найти");
        String namebook = input.nextLine();
        Book foundBookByName = bookService.findBookByTitle(namebook) ;
        if (foundBookByName != null) {
            System.out.println("Ваша книга " + foundBookByName);
        } else  {
            System.out.println("Книга с таким названием не найдена");
        }
    }

    private void printInfoforFindbyAuthor(){
        System.out.println("Введите имя автора книги которую хотите найти");
        String authorbook = input.nextLine();
        Book[] foundBookByAuthor = bookService.findBooksByAuthor(authorbook);
        if (foundBookByAuthor.length == 0) {
            System.out.println("Книги с таким автором не найдены");
        } else {
            System.out.println("Книги автора " + " : ");
            for (int i = 0; i < foundBookByAuthor.length; i++) {
                System.out.println(" - " + foundBookByAuthor[i]);

            }
        }
    }
    public void menu(){
        while (true) {
            System.out.println("===*Меню*===");
            System.out.println("1.Создание книг");
            System.out.println("2.Поиск книг");
            System.out.println("0.Выйти из программы");
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    createBook();
                    break;
                    case "2":
                        while(true) {
                            System.out.println("===Поиск Книг");
                            System.out.println("1.Найти по ID");
                            System.out.println("2.Найти по названию");
                            System.out.println("3.Найти по автору");
                            System.out.println("0.Вернуться в основное меню");
                            String extrachoice = input.nextLine();
                            switch (extrachoice) {
                                case "1":
                                    printInfoforFindtoId();
                                    break;
                                    case "2":
                                        printInfoforFindbyName();
                                        break;
                                        case "3":
                                            printInfoforFindbyAuthor();
                                            break;
                                            case "0":
                                                System.out.println("Переход в главное меню");
                                                break;
                                default:
                                    System.out.println("Вы сделали что не так ");

                            }
                            if (extrachoice.equals("0")) {
                                break;
                            }
                        }
                        break;
                        case "0":
                            return;
                            default:
                                System.out.println("Вы сделали что не так ");

            }
        }
    }


    }




