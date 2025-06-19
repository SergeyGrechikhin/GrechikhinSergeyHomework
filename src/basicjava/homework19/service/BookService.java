package basicjava.homework19.service;

import basicjava.homework19.entity.Book;
import basicjava.homework19.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository ;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
     public Book[] addBook(int id, String namebook, String author) {
        if (bookRepository.findById(id) != null) {
            System.out.println("Книга с таким ID уже существует!");
            return null;
        }
        Book book = new Book(namebook,id,author);
        bookRepository.save(book);
         return new Book[]{book};
     }
     public Book findBookById(int id) {
        return bookRepository.findById(id);
     }
     public Book[] getAllBooks() {
        if (bookRepository.getBookcounter() == 0) {
            return new Book[0];
        }
         return bookRepository.findAllBooks();
        }



        public Book[] findAllBooksByAuthor(String author) {
        return bookRepository.findBooksByAuthor(author);
        }

        public Book[] findAllBooksByName(String namebook) {
        return bookRepository.findBooksByName(namebook);
        }

     }


