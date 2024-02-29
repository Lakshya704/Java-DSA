import java.util.Scanner;
public class _2Vari_Dt_Exercise {
    public static void main(String[] args) {


        //Average Of three Numbers
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println((a + b + c) / 3);

        //Area Of square
//        System.out.println((a*a));

        //Bill
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        double bill = ((pencil + pen + eraser) * 1.8);
        System.out.println("Bill of Items You Have bought is + 18% gst tax :$" + Math.round(bill));
    }
}