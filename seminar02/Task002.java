
// Напишите метод, который сжимает строку.
// Input:  aaaabbbcdd
// Output: a4b3c1d2

package seminar02;

public class Task002 {
    public static void main(String[] args) {
        String text = "aaaabbbcdd";
        char[] charText = text.toCharArray();         // создаем массив чаров через метод toCharArray()
        int count = 1;
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length()-1; i++) {  // -1, чтобы не выйти за границы массива
            if (charText[i] == charText[i+1]) {
                count +=1;                
            } else {                
                newText.append(charText[i] + String.valueOf(count));  // переводим соunt из int в string иначе результат будет в двоичном коде
                count = 1;                                            // можно charText[i] перевести в string (любой (достаточно один из двух))
            }                                                         // т.е. нужно чтобы где-то была строка
        }
        newText.append(charText[charText.length-1] + String.valueOf(count));  // добавляем последний элемент, иначе он не входит в результат
        System.out.println(newText);                                          // a4b3c1d2
    }
}
