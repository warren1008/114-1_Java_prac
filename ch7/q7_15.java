import java.util.Scanner;
public class q7_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入兩個整數:");

        System.out.print("第一個整數:");
        int m = scn.nextInt();
        
        System.out.print("第二個整數:");
        int n =scn.nextInt();

        System.out.printf("%d和%d中，比較小的數字為:%d\n", m, n, min(m, n));
        scn.close();
    }
    
    public static int min(int a, int b) {
        
        if(b < a)
            return b;
        else
            return a;    
    }
}
