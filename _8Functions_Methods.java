import java.util.Scanner;

public class _8Functions_Methods {
    //Basic Syntax
    public static void printHW() {
        System.out.println("Hello World");
    }

    //Parameters
    public static int sum(int num1, int num2) { // {{ paramerters /params }}
        int sum = num1 + num2;
        return sum;
    }

    //Call by value not ref
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    //Product method
    public static int mul(int x, int y) {
        int product = (x * y);
        System.out.println("Multiplication of the numbers : " + product);
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    //binary coefficient --helper function
    public static int BinCoe(int c, int d) {
        int cd = factorial(c);
        int dc = factorial(d);
        int bin = factorial(c - d);
        int coe = cd / (dc * bin);
        return coe;
    }

    //Function Overloading
    public static int sumation(int a, int b) {
        return a + b;
    }

    public static int sumation(int a, int b, int c) {
        return a + b + c;
    }

    public static float sumation(float a, float b) {
        return a + b;
    }

    //prime number
    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Prime in an range
    public static void printPrimeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }

    //Binary to decimal conversion
    public static void BinDec(int bin) {
        int num = bin;
        int dec = 0;
        int pow = 0;
        while (bin > 0) {
            int lastD = bin % 10;
            dec = dec + (lastD * (int) Math.pow(2, pow));
            pow++;
            bin = bin / 10;
        }
        System.out.println("decimal of " + num + "=" + dec);
    }

    //decimal to binary conversion
    public static void DecBin(int dec) {
        int num = dec;
        int bin = 0;
        int pow = 0;
        while (dec > 0) {
            int rem = dec % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }
        System.out.println("binary of " + num + "=" + bin);
    }

    public static void main(String[] args) {
//        printHW();

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = sum(a, b);// {{ Arguments / Actual parameters }}
//        System.out.println("Sum of Numbers : " + sum);

//        int a = 5;
//        int b = 15;
//        swap(a, b);

//        mul(2, 4);

//        int fact = factorial(5);
//        System.out.println("Factorial =" + fact);

//        System.out.println("Bin. Coefficient of c and d is :" + BinCoe(5, 2));

//        System.out.println(sumation(12, 23));
//        System.out.println(sumation(12, 23, 34));
//        System.out.println(sumation(12.4f, 23.7f));

//        System.out.println(prime(121));

//        printPrimeRange(100);

        BinDec(1110);
        DecBin(7);
    }
}
