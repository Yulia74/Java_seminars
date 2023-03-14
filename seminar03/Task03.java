/* Заполнить список названиями планет Солнечной системы в произвольном
 * порядке с повторениями. Высести название каждой планеты и количество 
 * его повторений в списке.
 * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы. */

package seminar03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task03 {
    public static void main(String[] args) {
        ArrayList<String> planeta = new ArrayList<>(Arrays.asList("Марс", "Земля", "Марс"));
        Set<String> set = new LinkedHashSet<>(planeta);
        for (String item : set) {
            int count = Collections.frequency(planeta, item);
            System.out.printf("%s - %d\n", item, count);
        }
        for (String item : set) {
            int count = Collections.frequency(planeta, item);
            while (count > 1) {
                planeta.remove(item);
                count = Collections.frequency(planeta, item);
            }
        }
        System.out.println(String.join(", ", planeta)); // удаление повторяющегося элемента, есть еще команда remove
    }
}

// 2 вариант решения задачи (более предпочтителен, т.к. занимает меньше памяти)

class Task03a {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Юпитер");
        list.add("Сатурн");
        list.add("Сатурн");
        list.add("Марс");
        list.add("Венера");
        list.add("Меркурий");
        list.add("Венера");
        list.add("Земля");
        Set<String> set = new HashSet<>(list);

        for (String item : set) {
            System.out.println(item + ' ' + Collections.frequency(list, item));
        }
    }
}

// 3 вариант (создали массив и перевели его в коллекцию; память выделили и под массив и под коллекцию)

class Task03b {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(Arrays.asList("Земля", "Земля", "Венера", "Марс", "Нептун"));
        System.out.println(lst);
        Set<String> mySet = new HashSet<String>(lst);          // в set только уникальные значения

        for (String s : mySet) {
            System.out.println(s + " " + Collections.frequency(lst, s)); // сравнивая set c list проверяем сколько раз встречаются повторения
        }
    }
}
