/*
 * Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке,
а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

package seminar04;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        LinkedList<String> inputLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String srtFromCons;
        System.out.println("Введите значение для строки.\nДля выхода используйте 'print'");

        while (!(srtFromCons = scanner.nextLine()).equals("print"))
            inputLinkedList.addFirst(srtFromCons);
        scanner.close();
        System.out.println("Получился перевёрнутый LinkedList: " + inputLinkedList.toString());
    }
}

class Task02a {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();
        String action = "";

        while (!action.equals("quit")) {
            action = iScanner.nextLine();

            if (action.equals("print")) {
                String temp;
                temp = ll.getFirst();
                ll.set(0, ll.getLast());
                ll.set(ll.size() - 1, temp);
                System.out.println(ll);

            } else if (ll.size() > 0 && action.equals("revert")) {
                ll.remove(ll.size() - 1);
                System.out.println(ll);

            } else if (action.equals("quit")) {
                System.out.println(ll);
                System.exit(0);

            } else {
                ll.add(action);
            }
        }
        iScanner.close();
    }
}

class Task02b {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String temp = "";

        while (!temp.toLowerCase().equals("quit")) {
            System.out.println("Введите строку: ");
            temp = scanner.nextLine();

            if (!temp.toLowerCase().equals("print")) {
                Collections.reverse(linkedList);
                System.out.println(linkedList);
                Collections.reverse(linkedList);

            } else if (temp.toLowerCase().equals("revert")) {
                if (!linkedList.isEmpty()) {
                    linkedList.remove(linkedList.size() - 1);
                } else {
                    System.out.println("Список пуст.");
                }
            } else {
                linkedList.add(temp);
            }
        }
        scanner.close();
    }
}

class Task02c {
    public static void main(String[] args) {
        String input;
        LinkedList<String> Hr = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        input = "start";

        while (!input.equals("exit")) {
            input = sc.nextLine().toLowerCase();

            if (!input.equals("print")) {
                int index = Hr.size() - 1;
                // Выполнение реверсом
                Collections.reverse(Hr);
                System.out.println(Hr);
                Collections.reverse(Hr);
                // Выполнение поэлементно
                while (index >= 0) {
                    System.out.println(Hr.get(index));
                    index--;
                }
            } else if (input.equals("revert") && Hr.size() > 0) {
                if (Hr.size() > 0) Hr.remove(Hr.size() - 1);

            } else {
                Hr.add(input);
            }
        }
        sc.close();
    }
}