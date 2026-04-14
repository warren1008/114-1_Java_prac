import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入半徑:");
        double radius = scn.nextDouble();
        System.out.printf("圓形面積為:%.2f\n", area(radius));
        scn.close();
    }
    public static double area(double r) {
    return r*r*3.14;
    }
}
