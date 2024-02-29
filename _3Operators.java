public class _3Operators {
    public static void main(String[] args) {
        // binary operators
        int a = 20;
        int b = 5;
//        System.out.println("add : " + (a + b));
//        System.out.println("sub : " + (a - b));
//        System.out.println("mul : " + (a * b));
//        System.out.println("div : " + (a / b));
//        System.out.println("mod : " + (a % b));
//
        //Unary operator
        //Pre increment --> 1. Value Change --> 2. Value Use
        //Post increment --> 1. Value Use --> 2. Value Change
        int x = 10;
        int y = ++x;//Pre
        int y2 = x++;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(y2);

        //Pre decrement --> 1. Value Change --> 2. Value Use
        //Post decrement --> 1. Value Use --> 2. Value Change
        int x1 = 10;
        int y3 = --x1;//Pre
        int y4 = x1--;
//        System.out.println(x1);
//        System.out.println(y3);
//        System.out.println(y4);

        //Relational operators
        int A = 10;
        int B = 5;
        System.out.println((A == B));
        System.out.println((A != B));
        System.out.println((A > B));
        System.out.println((A < B));
        System.out.println((A >= B));
        System.out.println((A <= B));


    }
}
