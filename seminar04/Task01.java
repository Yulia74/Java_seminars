/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
*/
package seminar04;

import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
       String[] inputArr;
       String input = "test~0";
       try (Scanner sc = new Scanner(System.in)) {
        LinkedList<String> llist = new LinkedList<>();
           while (!input.equals("exit")) {
                System.out.println("Введите строку");
                input = sc.nextLine();
                inputArr = input.split("~");

                if (!inputArr[0].equals("print")) {
                    if (llist.size() < Integer.parseInt(inputArr[1])) {
                        for (int i = llist.size(); i < Integer.parseInt(inputArr[1]); i++) {
                            llist.add(null);
                        }
                    }
                    llist.add(Integer.parseInt(inputArr[1]), inputArr[0]);
                    System.out.println(llist);
                }
                else {
                    System.out.println(llist.get(Integer.parseInt(inputArr[1])));
                    llist.remove(Integer.parseInt(inputArr[1]));
                }
           }
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
} 
