package holidayWork.collection.collectionSecond10Tasks.task5;

import java.util.Iterator;
import java.util.LinkedList;

public class BookDemo {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<Book>();
        books.add(new Book("Book1",2000,"Author1"));
        books.add(new Book("Book2",1980,"Author2"));
        books.add(new Book("Book3",1970,"Author3"));
        System.out.println("After");
        System.out.println(books);

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if(book.getYear() < 2000){
                iterator.remove();
            }
        }
        System.out.println("Remove book if year < 2000");
        System.out.println("Before");
        System.out.println(books);
    }
}
