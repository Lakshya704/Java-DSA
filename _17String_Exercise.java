import java.util.Scanner;
import java.util.Arrays;

public class _17String_Exercise {
    // Que-1 Lower Case and vowels
    public static void lowerVowels(String str) {//--->O(n)
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("There are : " + count + " vowels in the input string");
    }

    //Que-4 Anagrams
    public static void anagrams(String s1, String s2) {//--->O(nlogn)
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] ch1 = s1.toCharArray();
            Arrays.sort(ch1);

            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1, ch2);
            if (result) {
                System.out.println("Strings : " + s1 + "," + s2 + " are anagrams");
            } else {
                System.out.println("Strings : " + s1 + "," + s2 + " are not anagrams");
            }

        } else {
            System.out.println("Strings : " + s1 + "," + s2 + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        //Q1
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        lowerVowels(str);

        //Q2
        String s1 = "earth";
        String s2 = "hear";
        anagrams(s1, s2);
    }
}
