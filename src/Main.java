//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что в во входной структуре будут
// повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Nastya", "213154");
        phoneBook.add("Kolya","998754");
        phoneBook.add("Igor","112113");
        phoneBook.add("Igor","154663");
        phoneBook.add("Mark","878623");
        phoneBook.add("Kolya","134654");
        phoneBook.add("Kolya","777878");

        phoneBook.printPhoneBook();

    }
}
