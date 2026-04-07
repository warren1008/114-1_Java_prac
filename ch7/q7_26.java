import java.util.Scanner;
public class q7_26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入底數b:");
        double base = scn.nextDouble();
        System.out.print("請輸入次方n:");
        double pow = scn.nextDouble();

        System.out.printf("%.2f^%.2f = %.2f\n", base, pow, power(base, pow));
        scn.close();        
    }
    public static double power(double b, double n) {
        if(n == 0)
            return 1;
        
        return b*power(b, n-1);
    }
}
