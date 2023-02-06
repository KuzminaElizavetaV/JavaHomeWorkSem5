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
                "Елизавеа", "Дорофей", "Николай", "Ирина", "Иван", "Дорофей", "Татьяна", "Евгений", "Анатолий",
                "Светлана", "Николай", "Иван", "Наталия", "София", "Кирилл", "Ярослав", "Николай", "Петр", "Владимир",
                "Александр", "София", "Елизавета", "Людмила", "Евгений", "Иван", "Ирина", "Вячеслав", "Ярослав"));
    }
    private static void getDuplicateNames(ArrayList<String> listNames){
        Map<String, Integer> nameQuantity = new HashMap<>();
        int count = 1;
        for (String name : listNames) {
            if(nameQuantity.containsKey(name));

        }
    }
}
