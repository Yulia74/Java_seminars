
// Дано четное число N(>0) и символы с1 и с2.
// Написать метод, который вернет строку длины N, которая
// состотит из чередующихся символов с1 и с2, начиная с с1.

package seminar02;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите положительное число N: ");
        int n = iScanner.nextInt();
        if (n % 2 != 0 && n > 0) {
            System.out.println("Четное число, это то, что делится на 2! Положительное - больше 0.");
            iScanner.close();
            return;
        }
        System.out.println("Введите символ с1");
        String c1 = iScanner.next();
        System.out.println("Введите символ с1");
        String c2 = iScanner.next();
        if (c1.length() != 1 || c2.length() != 1) {
            System.out.println("Требуется ввести один символ, а не целый набор!");
            iScanner.close();
            return;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {                                 // n/2 т.к. 2 символа записываются сразу
            result = result.append(c1 + c2);
        }
        System.out.println("Результатом операции стала строка вида:");
        System.out.println(result);
        iScanner.close();
    }
}
