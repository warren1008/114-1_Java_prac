

public class q7_30 {
    public static void main(String[] args) {
        
        System.out.println("max(3,5,8)的結果為" + max(3, 5, 8));
        System.out.println("max(5, 99)的結果為" + max(5, 99));
        
    }
    public static int max(int a, int b, int c) {
    
        if(b > a && b > c)
            return b;
        else if(c > b && c > a)
            return c;
        else
            return a;
        
    }

    public static int max(int a, int b) {
    
        if(a > b)
            return a;
        else
            return b;
    }
}
