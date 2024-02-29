import java.util.Scanner;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class _1Variable_DS {
    public static void main(String[] args) {
        // Primitive DataTypes
        byte b = 5;//1 byte
        short s = 10;//2 byte
        char ch = 'a';//2 byte
        boolean bool = true;//1 byte
        int i = 45;//4 byte
        long l = 4545455;//8 byte
        double price = 10.5;//4 byte
        float f = 23.6F;//8 byte
//        System.out.println(b);

        //SUM;(
        int x = 12;
        int y = 34;
        int sum = x + y;
//        System.out.println(sum);

        //Scanner Class
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(str);

        //PRODUCT AND SUM OF INPUTS
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println(num1 + num2);
//        System.out.println(num1 * num2);

        //Area Of circle
//        int num3 = sc.nextInt();
//        double aoc = (3.14 * num3 * num3);
//        System.out.println(aoc);

        //Type Conversion: byte-> short-> int-> float-> long-> double
        int q = 234;
        long w = q;
//        System.out.println(w);

        //Type Casting
        float number = 9.991f;
        int number2 = (int) number;
//        System.out.println(number2);
        char co = 'a';
        char co2 = 'b';
        int numb = co;
        int numb2 = co2;
//        System.out.println(numb);
//        System.out.println(numb2);

        //type promotion
        System.out.println(co - co2);
        int t1 = 10;
        float t2 = 25.56f;
        char t3 = 'a';
        double ans = t1 + t2 + t3;
        System.out.println(ans);
        System.out.println((int)t3);
    }
}