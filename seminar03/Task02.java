// Заполнить список десятью случайными числами.
// Осортировать список методом sort() и вывести его на экран

package seminar03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Task02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // случайное число от 0 до 99
            numbers.add(randomNumber);
        }

        System.out.println("Список случайных чисел: " + numbers);
        numbers.sort(null);
        System.out.println("Список случайных чисел: " + numbers);
    }
}

// 2 вариант

class Task02a {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            ints.add(new Random().nextInt(10));
        }
        System.out.println(ints);        
        Collections.sort(ints);        // sort ничего сам не выводит, просто сортирует, поэтому надо печатать
        Collections.reverse(ints);     // перевернет       
        System.out.println(ints);              
    }
}