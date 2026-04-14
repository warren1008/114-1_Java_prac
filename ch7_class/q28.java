import java.util.Scanner;
public class q28 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("請輸入一個正整數:");
        int num = scn.nextInt();

        System.out.println("結果為:"+ rsum(num));
        scn.close();
    }  
 
    public static int rsum(int n) {
        if (n ==1)
            return 0;
        return n*(n-1) +rsum(n-1);

    }
}
