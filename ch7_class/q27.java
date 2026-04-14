import java.util.Scanner;
public class q27 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("請輸入一個正整數:");
        int num = scn.nextInt();
        System.out.println("結果:" + sum(num));
        scn.close();
    }
    public static int sum(int n) {
        if(n==1)
            return 1;

        return n + sum(n-1);
    }
}
