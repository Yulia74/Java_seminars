/*
 *  Замерьте время, за которое в ArrayList добавляется 100000 элементов.
 *  Замерьте время, за которое в LinkedList добавляется 100000 элементов.
 *  Сравните с предыдущим.
 */

package seminar04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task00 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        long startTimeArray = System.nanoTime();

        for (int i = 0; i < 1000000; i++)
            arrayList.add(random.nextInt());
        Long endTimeArray = System.nanoTime();

        List<Integer> linkedList = new LinkedList<>();
        long startTimeLinked = System.nanoTime();

        for (int i = 0; i < 1000000; i++)
            linkedList.add(random.nextInt());
        long endTimeLinked = System.nanoTime();

        System.out.println("Время заполнения ArrayList  = " + (endTimeArray - startTimeArray));
        System.out.println("Время заполнения LinkedList = " + (endTimeLinked - startTimeLinked));
    }
}

// Время заполнения ArrayList  = 137118864
// Время заполнения LinkedList = 156094410