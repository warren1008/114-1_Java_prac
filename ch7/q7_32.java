import java.util.Scanner;

public class q7_32 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("請輸入整數半徑r");
        int rInt = scn.nextInt();
        System.out.println("圓形面積為: " + area(rInt));

        System.out.println("======");

        System.out.println("請輸入小數半徑r");
        
        double rDouble = scn.nextDouble();
        
        System.out.println("圓形面積為: " + area(rDouble));
        
        scn.close();
    }
    public static double area(double r) {
        return r*r*3.14;
    }
    
    public static int area(int r) {
        return (int)(r*r*3.14);
    }

}
