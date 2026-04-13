import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入一個整數:");
        int num = scn.nextInt();
        
        System.out.printf("%d的三次方為:%d\n", num,cubic(num));
        scn.close();
    }
    public static int cubic(int x) {
        return x*x*x;
    }
}
