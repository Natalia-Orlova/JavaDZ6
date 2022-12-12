package lesson6;

//Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
//
//1. ФИО,
//2. номер читательского билета,
//3. факультет,
//4. дата рождения,
//5. телефон.
//6. Методы (экземпляра, без слова static)  takeBook(), returnBook().
//7. Разработать программу, в которой создается массив объектов данного класса.
//8. Перегрузить методы takeBook(), returnBook():
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В.
//      взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса Book
//      (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги:
//      Приключения, Словарь, Энциклопедия".
//9. Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги:
//      Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".

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

    public void takeBook(int books) {
        System.out.println(this.name + " взял " + books + " книг");
    }

    public void returnBook() {

    }

    public void returnBook(int books){
        System.out.println(this.name + " вернул " + books + " книг");
    }

    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов И.И.", 123,
                "ФМФИ", "12.12.2002", "9252754623");
        Reader reader2 = new Reader ("Соколов П.П.", 245,
                "ЕГФ", "23.10.2004", "123456789");
        System.out.println(reader1);
        System.out.println(reader2);

        reader1.takeBook(10);
        reader1.returnBook(5);

        reader2.takeBook(4);
        reader2.returnBook(3);
    }

}