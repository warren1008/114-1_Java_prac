import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入一個整數:");
        int num = scn.nextInt();
        System.out.printf("%d的絕對值為:%d\n",num,abs(num));
        scn.close();
    }
    public static int abs(int x) {
        if(x<0)
            return -x;
        else
            return x;
        
        
    }
}
