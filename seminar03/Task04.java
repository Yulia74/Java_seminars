/* Создать список типа ArrayList<String>
 * Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.   (через парс инт, через поиск символов) */

package seminar03;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(); // List (т.е.коллекция с повторяющимися элементами)<внутри Строка>
                                              // название new - это то, что мы
        arr.add("1");                      // создаем новый объект ArrayList - уточнение
        arr.add("bild");
        arr.add("sun");
        arr.add("65");
        arr.add("hope");
        List<String> newArr = new ArrayList<>(); // создаем новый с которым будем работать (иначе получается мы рубим
                                                 // сук на котором сидим)
        for (String item : arr) {
            try {
                Integer.parseInt(item);
            } catch (Exception e) {
                newArr.add(item);
            }
        }
        System.out.println(newArr); // [bild, sun, hope]
    }
}

// если требуется удалить цифру в строке например wer5r, то replaceall([0-9],""), а потом удалить пустые, если они есть

// 2 вариант

class Task04a {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(); 
        lst.add("1");                      
        lst.add("bild");
        lst.add("sun");
        lst.add("65");
        lst.add("hope");

        System.out.println(lst);             // [1, bild, sun, 65, hope]

        int i = 0;
        while (i < lst.size()) {
            if (!tryParse(lst.get(i))) {    // вызываем метод (стр.56)
                lst.remove(lst.get(i));
            }
            i++;
        }
        System.out.println(lst);           // [bild, sun, hope]
    }
    static boolean tryParse(String st) {    // отдельный метод, возвращает true если можем инвентировать string в int
        try {
            Integer.parseInt(st);            
        } catch (NumberFormatException e) {
            return true;
        }
        return false;                        // если не может, тогда возвращает false
    }
}
