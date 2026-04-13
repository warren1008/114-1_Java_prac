import java.util.Scanner; 
public class q5 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入一個攝氏溫度:");
        double celsius = scn.nextDouble();
        System.out.printf("%.2f的華氏溫度為:%.2f\n", celsius,fahrenheit(celsius));
        scn.close();
    }
    public static double fahrenheit(double c) {
        return (9.0/5)*c +32;
    }
}
