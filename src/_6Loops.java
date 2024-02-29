import java.util.Scanner;

public class _6Loops {
    public static void main(String[] args) {
        //WHILE' LOOP
        Scanner sc = new Scanner(System.in);
//        int range = sc.nextInt();
//        int index = 1;
//        while (index <= range) {
////            System.out.println(index);
//            index++;
//        }
//
//
//        //SUM OF N-NATURAL NUMBERS
//        int sum = 0;
//        int i = 1;
//        while (i <= range) {
//            sum += i;
//            i++;
//        }
//        System.out.println("Sum of Numbers : " + sum);


        // REVERSE OF A NUMBER
//        int num=sc.nextInt();
//        while (num>0){
//            int lastD=num%10;
//            System.out.print(lastD);
//            num/=10;
//        }
//        int n = 123456789;
//        int rev = 0;
//        while (n > 0) {
//            int lastDig = n % 10;
//            rev = (rev * 10) + lastDig;
//            n /= 10;
//        }
//        System.out.print(rev);


        //FOR LOOP--STAR PATTERNS
//        for (int line = 1; line <= 4; line++) {
//            System.out.println("****");
//        }


        //Do-WhileLoop
//        int a = 0;
//        do {
//            System.out.println("Where are your hoes ?");
//            a++;
//        } while (a <= 10);


        //Break and continue statements
        int x = sc.nextInt();
        for (; x < 20; x++) {
            if (x % 10 == 0) {
                break;
            }
            System.out.println(x);
        }
    }
}