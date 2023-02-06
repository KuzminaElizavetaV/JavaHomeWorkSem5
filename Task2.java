import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет
 * повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> listEmployees = new ArrayList<>(Arrays.asList("Иван", "Петр", "Анатолий", "Светлана",
                "Елизавета", "Дорофей", "Николай", "Ирина", "Иван", "Дорофей", "Татьяна", "Евгений", "Анатолий",
                "Светлана", "Николай", "Иван", "Наталия", "София", "Кирилл", "Ярослав", "Николай", "Петр", "Владимир",
                "Александр", "София", "Елизавета", "Людмила", "Евгений", "Иван", "Ирина", "Вячеслав", "Ярослав"));
        countDuplicateNames(listEmployees);
    }
    private static void countDuplicateNames(ArrayList<String> listNames){ //считать повтояющиеся имена
        Map<String, Integer> nameQuantity = new HashMap<>();
        for (String name : listNames) {
            if(nameQuantity.containsKey(name)) {
                int count = nameQuantity.get(name);
                nameQuantity.put(name, ++count);
            } else nameQuantity.put(name, 1);
        }
        for (Map.Entry<String, Integer> entry: nameQuantity.entrySet()) {
            System.out.printf("%-10s %-5s\n", entry.getKey(), entry.getValue());
        }
    }
}
