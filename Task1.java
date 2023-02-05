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
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
