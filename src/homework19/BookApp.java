package homework19;

import homework19.repository.BookRepository;
import homework19.service.BookService;
import homework19.ui.UI;

public class BookApp {
    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository() ;
        BookService bookService = new BookService(bookRepository);
        UI ui = new UI(bookService);
        ui.userMenu();
    }
}
