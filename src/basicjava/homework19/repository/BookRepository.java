package basicjava.homework19.repository;

import basicjava.homework19.LibraryConfiguration;
import basicjava.homework19.entity.Book;

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



    public Book[] findBooksByName(String name) {
        int booksCounterfindBooksbyName = 0;
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].getNamebook().equalsIgnoreCase(name)) {
                booksCounterfindBooksbyName++;
            }
        }
        if (booksCounterfindBooksbyName == 0) {
            return new Book[0] ;
        }
        Book[] result = new Book[booksCounterfindBooksbyName];
        int index = 0;
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].getNamebook().equalsIgnoreCase(name)) {
                result[index++] = books[i];
            }
        }
        return result;
    }



    public Book[] findBooksByAuthor(String author) {
        int booksCounterfindBooksByAuthor = 0 ;
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                booksCounterfindBooksByAuthor++;
            }
        }
        if (booksCounterfindBooksByAuthor == 0) {
            return new Book[0];
        }
        Book[] result = new Book[booksCounterfindBooksByAuthor];
        int index = 0;
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                result[index++] = books[i];
            }
        }
        return result;
    }





}
