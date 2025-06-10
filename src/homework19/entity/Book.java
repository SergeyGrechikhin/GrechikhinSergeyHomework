package homework19.entity;

public class Book {
 private String namebook;
 private String  author;
 private int id;




    public Book(String namebook, int id, String author) {
        this.namebook = namebook;
        this.id = id;
        this.author = author;

    }

    public String getNamebook() {
        return namebook;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "namebook='" + namebook + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                '}';
    }
}
