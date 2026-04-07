import java.util.Scanner;
public class q7_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入攝氏溫度:"); 
        double celsius = scn.nextDouble();
        double result = fahrenheit(celsius);
        System.out.printf("攝氏溫度%.2f，華氏溫度為%.2f\n", celsius, result);
        scn.close();
    }
    public static double fahrenheit(double c) {
        double f = (9.0 / 5.0) * c +32;
        return f;
    }
}
