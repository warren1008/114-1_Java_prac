import java.util.Scanner;
public class q7_14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入整數計算其絕對值:");
        int m =scn.nextInt();
        
        System.out.printf("%d的絕對值為:%d\n", m, abs(m));
        scn.close();
    }
    public static int abs(int x) {
        if(x<0)
            return -x;
        else
            return x;
    }
}
