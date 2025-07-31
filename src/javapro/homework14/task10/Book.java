package javapro.homework14.task10;

import java.util.List;

public class Book {
    private String name;
    private List<String> tags;
    private String author;

    public Book(String name, String author, List<String> tags) {
        this.name = name;
        this.author = author;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", tags=" + tags +
                ", author='" + author + '\'' +
                '}';
    }
}
