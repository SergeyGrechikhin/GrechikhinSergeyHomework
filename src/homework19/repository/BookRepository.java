package homework19.repository;

import homework19.LibraryConfiguration;
import homework19.entity.Book;

import java.util.Arrays;

public class BookRepository {
 private Book[] books ;
 private int booksCounter;



    public BookRepository() {
     this.books = new Book[LibraryConfiguration.MAXBOOK];
     this.booksCounter = 0 ;
 }

    public int getBookcounter() {
        return booksCounter;
    }
    public boolean save(Book book){
        if (booksCounter < books.length) {
            books[booksCounter++] = book;
            return true;
        }
        return false;
    }
    public Book findById(int idForSearch){
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].getId() == idForSearch) {
                return books[i];
            }
        }
        return null;
    }
    public Book[] findAllBooks(){
      return Arrays.copyOf(books,booksCounter);
    }

    public Book findByName(String namebook ) {
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].getNamebook().equals(namebook)) {
                return books[i];
            }
        }
        return null;
    }

    public Book findByAuthor(String author) {
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].getAuthor().equals(author)) {
                return books[i];
            }
        }
        return null;
    }


}
