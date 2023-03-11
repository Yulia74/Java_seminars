/*
Напишите метод, который принимает на вход строку (String) 
и определяет является ли строка полиндромом (возвращает boolean значение) 

   1 вариант с созданием отдельного метода */

package seminar02;

public class Task003 {
    public static void main(String[] args) {
        String slovo = "А роза упала на лапу Азора";
        if (palindrom(slovo))
            System.out.println(slovo + " - это палиндром");
        else
            System.out.println(slovo + " - это не палинром");
    }

    public static boolean palindrom(String x) {
        String palSpace = x.replace(" ", "").toLowerCase(); // убираем пробелы и переводим все в нижний регистр
        char[] palSpaceCh = palSpace.toCharArray(); // для работы создаем массив char-ов

        for (int i = 0; i < palSpaceCh.length / 2; i++) {
            if (palSpaceCh[i] != palSpaceCh[palSpaceCh.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

// 2 вариант через создание StringBuilder

class Task003a {
    public static void main(String[] args) {
        System.out.println(palindrom("шалаш"));
    }
    static boolean palindrom(String str) {
        String newString = new StringBuilder(str).reverse().toString(); // reverse() переворачивает строку задом на перед и сравнивает
        if (newString.equals(str)) {                                    // совпадает ли объект newString со str (это разные классы!)
            return true;
        }
        return false;              // true
    }
}
