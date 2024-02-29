public class _9Function_Exercise {
    //Average of three numbers
    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void palindrone(int a) {
        int sum = 0;
        int temp = a;
        while (a > 0) {
            int rem = a % 10;
            sum = rem + (sum * 10);
            a = a / 10;
        }
        if (temp == sum) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not Palindrome number");
        }
    }

    //sum of the digits in an integer
    public static void Sum(int a) {
        int sum = 0;
        while (a > 0) {
            int lastD = a % 10;
            sum = sum + lastD;
            a = a / 10;
        }
        System.out.println("Sum of digits in nunber is : " + sum);
    }

    public static void main(String[] args) {
//        System.out.println(average(11, 22, 33));

//        System.out.println(isEven(21));

//        palindrone(123241);

//        Sum(123456);

        System.out.println(Math.max(12, 10));
        System.out.println(Math.min(12, 10));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.abs(-12.56));

    }
}
