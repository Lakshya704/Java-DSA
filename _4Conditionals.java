import java.util.Scanner;

public class _4Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Greater Number
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if (a > b) {
//            System.out.println("Greater Number is A ie : " + a);
//        } else {
//            System.out.println("Greater Number is B ie : " + b);
//        }


        // Even / Odd  Number
//        int a = sc.nextInt();
//        System.out.println("Enter the Number that you wanna check " + a);
//        if (a % 2 == 0) {
//            System.out.println("number is even");
//        } else {
//            System.out.println("number is odd");
//        }


        //Else-if ladder--> Income Tax Calculator
//        int income = sc.nextInt();
//        int tax = 0;
//        if (income < 500000) {
//            tax = 0;
//            System.out.println("Your Income Tax Is : " + tax);
//        } else if (500000 <= income && income < 1000000) {
//            tax = (int) (income * 0.2);
//            System.out.println("Your Income Tax Is : " + tax);
//        } else {
//            tax = (int) (income * 0.3);
//            System.out.println("Your Income Tax Is : " + tax);
//        }


        // Greatest Of 2 numbers
//        int X=sc.nextInt();
//        System.out.println("Enter the Value Of X : "+X);
//        int Y=sc.nextInt();
//        System.out.println("Enter the Value Of Y : "+Y);
//        int Z= sc.nextInt();
//        System.out.println("Enter the Value Of Z : "+Z);
//        if((X>=Y)&&(X>=Z)){
//            System.out.println("Greatest Number is X");
//        }
//        else if(Y>=Z){
//            System.out.println("Greatest Number is Y");
//        }
//        else {
//            System.out.println("Greatest Number is Z");
//        }

        //Ternary operator
//        int num = 4;
//        String t = ((num % 2) == 0) ? "even" : "odd";
//        System.out.println(t);


        //Else-if
//        int mark=sc.nextInt();
//        if(mark>=33) {
//            System.out.println("PASS");
//        }
//        else{
//            System.out.println("Fail");
//        }

        //Switch Case--> CALCULATOR
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char opr = sc.next().charAt(0);
        switch (opr) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Enter a default value");
        }
    }

}

