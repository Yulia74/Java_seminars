// Дан массив nums = [3,2,2,3] и число val = 3. 
// Eсли в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от 
// заданного, а остальные - равны ему.

package seminar01;

import java.util.Arrays;
import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 3, 1, 3, 2, 5, 5, 3, 2, 3, 3 };

        System.out.println(Arrays.toString(arr)); // вывод массива первоначальный вид

        int val = 3;
        int changePos = arr.length - 1;     // т.к. последний элемент массива постоянно меняется
        for (int i = 0; i < changePos; i++) {
            if (arr[i] == val) {
                int temp = arr[i];         // временная переменная видна только внутри цикла 
                arr[i] = arr[changePos];   // заменяю на последний элемент
                arr[changePos] = temp;     // в последний кладу подходящее значение
                changePos--; // чтобы не проверять последние (переставленные) элементы, т.к. цикл замкнется
                i--; // сначала верни i, потом отними 1, т.к. изымаем элемент и массив сдвигается
                     // влево
            }
        }
        System.out.println(Arrays.toString(arr)); // вывод массива с перестановкой
    }
}

// другой вариант (очень энергозатратный)

class Task003a {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 3, 1, 3, 2, 5, 5, 3, 2, 3, 3 };

        System.out.println(Arrays.toString(arr)); // вывод массива первоначальный вид

        int val = 3;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == val) {
                    int buff = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buff;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// вариант с созданием нового массива (недостаток новый массив может занять много памяти)

class Task003b {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 3, 1, 3, 2, 5, 5, 3, 2, 3, 3 };

        System.out.println(Arrays.toString(arr));


        int[] newArr =new int[arr.length];
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        int count = 0;
        input.close();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                newArr[count++] = arr[i];
            }
        }
        int newLehgth = arr.length - count;

        for (int i = 0; i < newLehgth; i++) {
            newArr[count++] = number;
        }
        System.out.println(Arrays.toString(newArr));
    }
}


