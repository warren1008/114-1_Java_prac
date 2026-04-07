import java.util.Scanner;
public class q7_28 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("請輸入正整數n:");

        int n = scn.nextInt();
        System.out.printf("1*2+2*3+3*4+...+%d*%d = %d\n", n-1, n, rsum(n));
        
        scn.close();
    }
    public static int rsum(int n) {
        
        if (n <=1)
            return 0;
        

        return  rsum(n-1)  + (n - 1) * n ;
    }
}
