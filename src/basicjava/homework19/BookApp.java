package basicjava.homework19;

import basicjava.homework19.repository.BookRepository;
import basicjava.homework19.service.BookService;
import basicjava.homework19.ui.UI;

public class BookApp {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository() ;
        BookService bookService = new BookService(bookRepository);
        UI ui = new UI(bookService);
        ui.userMenu();
    }
}
