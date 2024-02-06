import java.util.*;

public class PhoneBook {

    private static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public HashMap<String, List<String>> add(String name, String phoneNum) {

        if (phoneBook.containsKey(name)) {
            List<String> numbers = phoneBook.get(name);
            numbers.add(phoneNum);
            phoneBook.put(name, numbers);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNum);
            phoneBook.put(name, numbers);
        }
        return phoneBook;
    }
    public static void printPhoneBook() {
        System.out.println("Неотсортированный массив: " + phoneBook + "\n Отсортированный массив:");
        sortPhoneBook(phoneBook);
    }
    public static void sortPhoneBook(HashMap<String, List<String>> phoneBook) {

        List<Map.Entry<String, List<String>>> sortedList = new ArrayList<>(phoneBook.entrySet());
        sortedList.sort(new Comparator<Map.Entry<String, List<String>>>() {
            @Override
            public int compare(Map.Entry<String, List<String>> entry1, Map.Entry<String, List<String>> entry2) {
                return Integer.compare(entry2.getValue().size(), entry1.getValue().size());
            }
        });
        for (Map.Entry<String, List<String>> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
