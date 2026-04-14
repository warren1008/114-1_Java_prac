import java.util.Scanner;
public class q26 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("請輸入一個實數:");
        double num =scn.nextDouble();

        System.out.print("請輸入一個次方:");
        int cube =scn.nextInt();

        System.out.println("結果為:" + power(num,cube));
        scn.close();
    }
    public static double power(double b,int n) {
        if(n ==0)
            return 1;
        return b*power(b,n-1);
}
}
