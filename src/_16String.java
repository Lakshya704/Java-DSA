import java.util.Scanner;

public class _16String {
    public static void printStr(String vin) {
        for (int i = 0; i < vin.length(); i++) {
            System.out.print(vin.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean palindrone(String pali) {
        for (int i = 0; i < pali.length() / 2; i++) {
            if (pali.charAt(i) != pali.charAt(pali.length() - 1 - i)) {
                System.out.println("Your String is Not Palindrome : " + pali);
                return false;
            }
        }
        System.out.println("Your String is Palindrome : " + pali);
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {//North dir
                y++;
            } else if (dir == 'S') {//South dir
                y--;
            } else if (dir == 'E') {//East dir
                x++;
            } else {//West dir
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String subString(String vin, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += vin.charAt(i);
        }
        return subStr;
    }

    public static String toUppercase(String convert) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(convert.charAt(0));
        sb.append(ch);

        for (int i = 1; i < convert.length(); i++) {
            if (convert.charAt(i) == ' ' && i < convert.length() - 1) {
                sb.append(convert.charAt(i));
                i++;
                sb.append(Character.toUpperCase(convert.charAt(i)));
            } else {
                sb.append(convert.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
//        System.out.println(arr);
        //Strings are IMMUTABLE
        String str = "abcd";
        String str2 = new String("xyz");
//        System.out.println(str + " " + str2);

        //INPUTS in string
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();//sc.next()-->>For Single Word
//        System.out.println(input);

        //Length Of an String
        String vin = "Thorfinn , Son of thor";
//        System.out.println(vin.length());

        //String Concat
        String land = "! Friend of Slave named EINAR";
//        System.out.println(vin + " " + land);

        //String charAt Method
//        printStr(vin);

        //Palindrome String--->>TC : O(n)
        String pali = "noon";
//        palindrone(pali);

        //Shortest Path Question
        String path = "WNEENESENNN";
//        System.out.println(getShortestPath(path));

        //String << equals >> Functions
        String eq = "ThorFinn";
        String eq2 = new String("ThorFinn");

//        if (eq == eq2) {
//            System.out.println("String are EQUAL");
//        } else {
//            System.out.println("String are not EQUAL");
//        }
//
//        if (eq.equals(eq2)) {
//            System.out.println("String are EQUAL");
//        } else {
//            System.out.println("String are not EQUAL");
//        }

        //String <<SubString>> Function & Method
//        System.out.println(subString(vin, 0, 4));//Function Calling
//        System.out.println(vin.substring(0, 4));//Inbuild Function


        //String lexigraphically <<compateTo>> Function
        // Str1.compareTo(str2)
        //        0:EQUALS
        //        <0:-ve str1<st2;
        //        >0:+ve str>str2

//        String fruits[] = {"apple", "mango", "banana"};
//        String largest = fruits[0];
//        for (int i = 0; i < fruits.length; i++) {
//            if (largest.compareTo(fruits[i]) < 0) {
//                largest = fruits[i];
//            }
//        }
//        System.out.println(largest);

        // STRING BUILDER
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch + " ");
        }
//        System.out.println(sb);
//        System.out.println(sb.length());

        //Convert to upperCase
        String convert = "hey , aye yo thorfinn arigatto";
        System.out.println(toUppercase(convert));
    }
}
