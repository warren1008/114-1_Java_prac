import java.util.Scanner;
public class q7_13 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("請輸入整數半徑r:");
        
        double radius = scn.nextDouble();
        
        System.out.printf("半徑%.2f的圓面積為:%.2f平方單位\n", radius, area(radius));
        
        scn.close();
    }
    public static double area(double r) {
        
        return 3.14*r*r;        
    }
}
