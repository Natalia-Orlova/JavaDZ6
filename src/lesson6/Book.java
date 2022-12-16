package lesson6;

public class Book {
    String bookName;
    String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName () {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}