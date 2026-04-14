public class q32 {
    public static void main(String[] args) {
        System.out.printf("結果為:%.2f\n", area(2.3));
        System.out.printf("結果為:%d\n", area(2));
    
    }
    
    public static int area(int r) {
        return (int)(r*r*3.14);
    }

    public static double area(double r) {
        return r*r*3.14;
    }

}
