package basicjava.homework5.task1;

public class Bookdemo {
    public static void main(String[] args) {
        Book newbook = new Book() ;
        newbook.title = "Историческая " ;
        newbook.author = "В.А.Иванов" ;
        newbook.year = 1995 ;
        newbook.isIssued = true ;

        System.out.println(" Имя Книги : " + newbook.title);
        System.out.println(" Имя Автора : " + newbook.author);
        System.out.println(" Год Выпуска : " + newbook.year);
        System.out.println(" Выдана книга или нет (Да или Нет ) : " + newbook.isIssued);


        System.out.println("----------------------------------------------");



        Book newbook1 = new Book() ;

        newbook1.title = "Литературная " ;
        newbook1.author = "В.А.Петров" ;
        newbook1.year = 2000 ;
        newbook1.isIssued = false ;

        System.out.println(" Имя Книги : " + newbook1.title);
        System.out.println(" Имя Автора : " + newbook1.author);
        System.out.println(" Год Выпуска : " + newbook1.year);
        System.out.println(" Выдана книга или нет (Да или Нет ) : " + newbook1.isIssued);

    }
}
