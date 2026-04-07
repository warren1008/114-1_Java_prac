import java.util.Scanner;
public class q7_27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入正整數n:");
        int n = scn.nextInt();
        System.out.println("遞迴結果為:" + sum(n));
        scn.close();
    }
    public static int sum(int n) {
    
        if(n == 1)
            return 1;

        return  n + sum(n-1);
    }
}
