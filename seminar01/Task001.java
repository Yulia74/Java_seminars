// запросить пользователя ввести имя; вывести на экран: Привет, имя!

package seminar01;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); // "объект типа scanner" или переменная, а правельнее "экзэмпляр класса scanner",
        System.out.print("name: ");       //  printf - что будет в терминале    
        String name = iScanner.nextLine();        // получение следующей строки   
        System.out.printf("Привет, %s!\n", name);  // вывод на экран  %s - особенность VSC, его быть не должно
        iScanner.close();
    }
}

// второй вариант (без форматированной строки)

class Task001a {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in); 
        System.out.print("Введите ваше имя: "); //  Введите ваше имя: Yulia       
        String name = iScanner.nextLine();          
        System.out.println("Привет, " + name);   // Привет, Yulia
        iScanner.close();
    }
}

// println - выводит запрос и переносит на новую строку
// print   - выводит запрос и не переносит ответ на новую строку
// printf - для форматированной строки


// вариант через input

class Task001b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Введите ваше имя: ");        
        String name = input.next();          
        System.out.println("Привет, " + name + '!');   
        input.close();
    }
}

// варинат без использования Scannera

class Task001c {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите ваше имя: ");        
        String name = System.console().readLine();          
        System.out.println("Привет, " + name + '!');         
    }
}