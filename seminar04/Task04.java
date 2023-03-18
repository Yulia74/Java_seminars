package seminar04;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer newElement = 10;
        
        System.out.println("Размер массива: " + size(array));
        System.out.println("Массив пуст: " + empty(array));
        System.out.println("Добавить в массив элемент \"10\":" + Arrays.toString(push(array, newElement)));
        System.out.println("Последний элемент в массиве: " + peek(array));
        System.out.println("Удалить из массива последний элемент: " + Arrays.toString(pop(array)));
    }

    static Integer size(Integer[] inputArray) {
        return inputArray.length;
    }

    static boolean empty(Integer[] inputArray) {
        if (inputArray.length < 1) {
            return true;
        }
        return false;
    }

    static Integer[] push(Integer[] inputArray, Integer newElement) {
        Integer[] newArray = new Integer[inputArray.length + 1];
        System.arraycopy(inputArray, 0, newArray, 0, inputArray.length);
        newArray[inputArray.length] = newElement;
        return newArray;
    }

    static Integer peek(Integer[] inputArray) {
        return inputArray[inputArray.length - 1];
    }

    static Integer[] pop(Integer[] inputArray) {
        Integer[] newArray = new Integer[inputArray.length - 1];
        System.arraycopy(inputArray, 0, newArray, 0, inputArray.length - 1);
        return newArray;
    }
}