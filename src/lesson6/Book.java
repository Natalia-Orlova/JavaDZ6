package lesson6;

public class Book {
    String bookName;
    String authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book ("Дискретная математика", "А.А. Набебин");
        Book book2 = new Book ("Теория алгоритмов", "В. Игошин");
        Book book3 = new Book ("Математическая логика", "А.Н. Колмогоров");
        Book book4 = new Book ("История географии", "Е.И. Перцик");

        System.out.println(book1);

    }
}