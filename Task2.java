import java.util.*;
import java.util.stream.Collectors;
/**Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, которая найдет и выведет
 * повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> listEmployees = new ArrayList<>(Arrays.asList("Иван", "Петр", "Анатолий", "Светлана",
                "Елизавета", "Дорофей", "Николай", "Ирина", "Иван", "Дорофей", "Татьяна", "Евгений", "Анатолий",
                "Светлана", "Николай", "Иван", "Наталия", "София", "Кирилл", "Ярослав", "Николай", "Петр", "Владимир",
                "Александр", "София", "Елизавета", "Людмила", "Евгений", "Иван", "Ирина", "Вячеслав", "Ярослав"));
        sortValuesDescendingOrder(countDuplicateNames(listEmployees));
    }
    private static Map<String, Integer> countDuplicateNames(ArrayList<String> listNames) { //считать повтояющиеся имена
        Map<String, Integer> nameQuantity = new HashMap<>();
        for (String name : listNames) {
            if (nameQuantity.containsKey(name)) {
                int count = nameQuantity.get(name);
                nameQuantity.put(name, ++count);
            } else nameQuantity.put(name, 1);
        }
        System.out.println("РЕЗУЛЬТАТ ПОДСЧЕТА ПОВТОРЯЮЩИХСЯ ИМЕН:");
        for (Map.Entry<String, Integer> entry : nameQuantity.entrySet()) {
            System.out.printf("%-10s %-5s\n", entry.getKey(), entry.getValue());
        }
        return nameQuantity;
    }
    private static void sortValuesDescendingOrder (Map<String, Integer> unsortedMap) {
        //сортировка по значению с помощью LinkedHashMap, нашла вот такое решение, на мой взгляд, самое оптимальное
        Map<String, Integer> sortedMap = unsortedMap.entrySet().stream().
                sorted(Comparator.comparingInt(e -> -e.getValue())).collect(Collectors.
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {throw new AssertionError();},
                                LinkedHashMap::new));
        System.out.println();
        System.out.println("ОТСОРТИРОВАННЫЙ СПИСОК ПО УБЫВАНИЮ ПОПУЛЯРНОСТИ:");
        for (Map.Entry<String, Integer> elem : sortedMap.entrySet()) {
            System.out.printf("%-10s %-5s\n", elem.getKey(), elem.getValue());
        }
    }
}

