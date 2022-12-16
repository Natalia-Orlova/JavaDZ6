package lesson6;

public class Reader {
    String name;
    Integer libraryCard;
    String faculty;
    String dateOfBirth;
    String phoneNumber;


    public Reader(String name, Integer libraryCard, String faculty,
                  String dateOfBirth, String phoneNumber) {
        this.name = name;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", libraryCard=" + libraryCard +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void takeBook(){

    }

    //takeBook, который будет принимать количество взятых книг.
    // Выводит на консоль сообщение "Петров В. В. взял 3 книги"
    public void takeBook(int books) {
        System.out.println(this.name + " взял(а) " + books + " книг(и)");
    }

    //takeBook, который будет принимать переменное количество названий книг.
    // Выводит на консоль сообщение "Петров В. В.
    // взял книги: Приключения, Словарь, Энциклопедия".
    public void takeBook(String... books) {
        System.out.print(this.name + " взял(а) книги: ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i] + ", ");
        }
        System.out.println(books[books.length - 1]);
    }

    public void takeBook(Book... booksList) {
        System.out.print(this.name + " взял(а) книги: ");
        for (int i = 0; i < booksList.length - 1; i++) {
            System.out.print(booksList[i].bookName + ", ");
        }
        System.out.println(booksList[booksList.length - 1].bookName);
    }


    public void returnBook() {

    }

    public void returnBook(int books){
        System.out.println(this.name + " вернул(а) " + books + " книг(и)");
    }

    public void returnBook(String... books) {
        System.out.print(this.name + " вернул(а) книги: ");
        for (int i = 0; i < books.length - 1; i++) {
            System.out.print(books[i] + ", ");
        }
        System.out.println(books[books.length - 1]);
    }

    public void returnBook(Book... booksList) {
        System.out.print(this.name + " вернул(а) книги: ");
        for (int i = 0; i < booksList.length - 1; i++) {
            System.out.print(booksList[i].bookName + ", ");
        }
        System.out.println(booksList[booksList.length - 1].bookName);
    }
}