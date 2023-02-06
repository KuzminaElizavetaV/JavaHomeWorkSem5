import java.util.*;

/**Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
 * */
public class Task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        phoneBook.put("Иванов", new ArrayList<>(Arrays.asList("9025553412", "9954221005", "9611216732")));
        phoneBook.put("Петров", new ArrayList<>(Arrays.asList("9025653412", "9954231005", "9622216732")));
        phoneBook.put("Васечкин", new ArrayList<>(Arrays.asList("9035554412", "9954221125", "9631226732")));
        phoneBook.put("Иванова", new ArrayList<>(Arrays.asList("9105555412", "9954551125", "9631346732")));
        phoneBook.put("Кузькин", new ArrayList<>(Arrays.asList("9105665412", "9954551385")));
        System.out.println("ТЕЛЕФОННЫЙ СПРАВОЧНИК:");
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            System.out.printf("%-10s %-50s\n", entry.getKey(), entry.getValue());
        }
        System.out.println();
        findPhoneByName(phoneBook);
    }
    private static void findPhoneByName(Map<String, ArrayList<String>> telephoneBook){ //метод поиска в телефонной книге по имени
        Scanner scanner = new Scanner(System.in);
        String name = "null";
        while (!name.equals("0")) {
            System.out.println("ВНИМАНИЕ! Чтобы выйти из режима поиска, введите 0");
            System.out.print("Введите фамилию контакта: ");
            name = scanner.nextLine();
            if (telephoneBook.containsKey(name))
                System.out.println("У контакта \"" + name + "\" вот такие номера телефонов: " +
                        telephoneBook.get(name));
            else if (name.equals("0")) System.out.println("Вы вышли из режима поиска!");
            else System.out.println("Такого контакта в справочнике нет!!!");
        }
    }
}
