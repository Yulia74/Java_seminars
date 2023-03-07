// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

package seminar01;

import java.util.Arrays;   // Для использования Arrays в своих классах необходимо прописать импорт:
import java.util.Scanner;
import java.util.Random;


public class Task002 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count ++;
            } else {
                if (count > countMax) {
                    countMax = count;
                } 
                count = 0;
            }
        }
        if (count > countMax) {
            countMax = count;
        }
        System.out.println(Arrays.toString(arr));  // выводит массив на печaть Arrays - класс, toString()метод, arr аргумент
        System.out.printf("Максимальное количество подряд идущих 1 в массиве: %s\n", countMax);
    }
}    


// вариант решения задачи через Random 

class Task002a {
    private static Scanner iScanner;

    public static void main(String[] args) { 
        Random random = new Random();
        System.out.print("Введите длинну массива: ");
        int[] arr = new int[new Scanner(System.in).nextInt()];
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        for (int i : arr) {
            if (i == 1) {
                count ++;
                if (countMax < count) {
                    countMax = count;
                }
            } else
                count = 0;
        }
        System.out.println(Arrays.toString(arr));  
        System.out.printf("Максимальное количество подряд идущих 1 в массиве: %s\n", countMax);
        iScanner.close();        
    }
}
  

        
        

