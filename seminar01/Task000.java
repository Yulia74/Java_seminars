package seminar01;

import java.time.LocalDateTime;

public class Task000 {
    public static void main(String[] args) {
       System.out.println("Hello, world!");      // Hello, world!
    }
}

// Вывести на экран дату и текущее время
// с созданием новой переменной

class Task0001 {
    public static void main(String[] args) {
        LocalDateTime nowDate = LocalDateTime.now();   // объект класса LocalDateTime переменная nowDate
        System.out.println(nowDate);                   // 2023-03-06T20:50:40.984736500
    }
}

// вариант - без создания переменной, если она в дальнейшем в коде не понадобится

class Task0002 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());     // 2023-03-06T20:54:58.661413400
    }
}