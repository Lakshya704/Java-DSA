import java.util.Scanner;

public class _7Loops_Exercise {
    public static void main(String[] args) {
        // Q1--> Radii of circle
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the radii of the circle :");
//        int radii = sc.nextInt();
//        double aoc = (3.14 * radii * radii);
//        System.out.println("Area of circle is : " + aoc);


        //Q2-->TABLE
//        System.out.print("Enter the number :");
//        int number = sc.nextInt();
//        for (int start = 1; start <= 10; start++) {
//            System.out.print(number * start + " ");
//        }

        //Q3-->Switch case on months
//        int month = sc.nextInt();
//        switch (month) {
//            case 1:
//                System.out.println("jan");
//                break;
//            case 2:
//                System.out.println("feb");
//                break;
//            case 3:
//                System.out.println("mar");
//                break;
//            case 4:
//                System.out.println("apr");
//                break;
//            case 5:
//                System.out.println("may");
//                break;
//        }


        //Q4-->PAtterns LOOPS>>>>>>
//        for (int i = 1; i <= 4; i++) {
//            //For one line
//            for (int j = 1; j <= 4 - i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int n = 4;
        char ch = 'A';
        for (int line = 1; line <= 4; line++) {
            //For one line
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
