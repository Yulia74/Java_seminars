/* Напишите метод, который составит строку, состоящую из 100
 * повторений слова TEST и метод, который запишет эту строку
 * в простой текстовый файл, обработайте исключения.
 */

// вариант без создания метода

package seminar02;

import java.io.FileWriter;
import java.io.IOException;

public class Task004 {
    public static void main(String[] args) {
        String str = "TEST";
        StringBuilder result = new StringBuilder();
        result.append(str.repeat(100));          // вариант без цикла for
        System.out.println(result);

        try (FileWriter fw = new FileWriter("file.txt", false)) { // метод на наличие (создание) файла
            for (int i = 0; i < 100; i++) {
                fw.write(str + '\n');                  // записывает 100 раз TEST
            }
            fw.flush();                               // из буфера все выкидывает
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

// вариант через метод (и правильное оформление Exception)

class Task004a {
    public static void main(String[] args) throws IOException {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            text.append("TEST");
        }
        method(text);                                // передаем в метод
    }
    static void method(StringBuilder text) throws IOException {
        try (FileWriter fw = new FileWriter("file.txt", false)) {   
            fw.write(text.toString());              // записывает в файл, а прежде преобразовывает в string
            fw.flush();
        } catch (IOException ex) {
            throw new IOException(ex.getMessage());
        }
    }
}
    