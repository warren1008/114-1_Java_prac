import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.println("請輸入兩個整數:");
        System.out.print("整數1: ");
        int num1 = scn.nextInt();

        System.out.print("整數2: ");
        int num2 = scn.nextInt();

        System.out.println("比較小的數字:" + min(num1, num2));
        scn.close();

    }
    public static int min(int a,int b) {
        return (a<b) ?a:b;
    }
}
