/*
   1) Написать метод, который принимает массив элементов, помещает их в стэк
   и выводит на консоль содержимое стэка.
   2) Написать метод, который принимает массив элементов, помещает их в очередь
   и выводит на консоль содержимое очереди.
 */

package seminar04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task03 {
    public static void main(String[] args) {
        int[] array = createArray();
        //showStack(addToStack(array));
        showLinkedList(addToQueue(array));
    }

    static Stack<Integer> addToStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        return stack;
    }

    static void showStack(Stack<Integer> stack) {
        for (Integer item : stack) {
            System.out.print(item + " / ");
        }
        System.out.println();
        System.out.println(stack);

        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }
    }

    static int[] createArray() {
        int[] myIntArr = new int[10];
        for (int i = 0; i < myIntArr.length; i++) {
            myIntArr[i] = i;
        }
        return myIntArr;
    }

    static LinkedList<Integer> addToQueue(int[] array) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int item: array) {
            linkedList.addLast(item);
        }
        return linkedList;
    }

    static void showLinkedList(LinkedList<Integer> linkedList) {
        for (Integer item : linkedList) {
            System.out.print(item + " / ");
        }
        System.out.println();
        System.out.println(linkedList);

        while (linkedList.size() > 0) {
            System.out.print(linkedList.poll() + " ");
        }
    }
}

class Task03a {
    public static void main(String[] args) {
        int[] array = new int[] {1, 45, 7, 1, 5, 46, 78};
        System.out.println(getStack(array));
        System.out.println(getStack(array).getClass());
        System.out.println(getQueue(array));
        System.out.println(getQueue(array).getClass());
    }
    static Stack<Integer> getStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int item : array) {
            stack.add(item);
        }
        return stack;
    }
    static Queue<Integer> getQueue(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (int item : array) {
            queue.add(item);
        }
        return queue;
    }
}
