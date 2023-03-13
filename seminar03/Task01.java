/* Даны следующие строки, сравнить их с помощью == 
   и метода equals() класса Object
   String s1 = "hello";
   String s2 = "hello";
   String s3 = s1;
   String s4 = "h"+"e"+"l"+"l"+"o";
   String s5 = new String("hello");
   String s6 = new String(new char[]{'h','e','l','l','o'});  */

package seminar03;

import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";             // Конкатена́ция — операция склеивания объектов линейной структуры
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

        System.out.println(s1.equals(s2));
        List<String> stringList = List.of(s1, s2, s3, s4, s5, s6);
        for (String string : stringList) {
            System.out.println("равны ли через equals s1 и " + string + " " + s1.equals(string));
        }
        System.out.println();
        for (String string : stringList) {
            System.out.println("равны ли через == s1 и " + string + " " + (s1 == string));
        }
    }
}

//  через equals(string)
// равны ли через equals s1 и hello true
// равны ли через equals s1 и hello true
// равны ли через equals s1 и hello true
// равны ли через equals s1 и hello true
// равны ли через equals s1 и hello true
// равны ли через equals s1 и hello true


// через == (у String s5 = new String и String s6 = new String ссылки разные, == их видит как разные)
// равны ли через == s1 и hello true
// равны ли через == s1 и hello true
// равны ли через == s1 и hello true
// равны ли через == s1 и hello true
// равны ли через == s1 и hello false
// равны ли через == s1 и hello false