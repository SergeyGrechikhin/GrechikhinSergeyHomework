package homework6.task2;

public class Library {
    String bookname ;
    String author ;
    boolean onthehand ;


    public Library(String bookname, String author) {
        this.bookname = bookname;
        this.author = author;

    }

    public void textinfo() {
        System.out.println(" Название книги : " + bookname);
        System.out.println(" Автор : " + author);
    }

    public void textinfoonthehand() {
        onthehand = true ;
        System.out.println(" Книга была выдана? Да или Нет : " + onthehand);

    }

    public void textinfoonthehand1() {
        onthehand = false ;
        System.out.println(" Книга есть в наличие? Да или Нет : " + onthehand);

    }



    public void textinfoonthehand2() {
        onthehand = true;
        System.out.println(" Книга была возвращена ? Да или Нет : " + onthehand);

    }

    public void textinfoonthehand3() {
        onthehand = true ;
        System.out.println(" Книга есть в наличие? Да или Нет : " + onthehand);

    }
}
