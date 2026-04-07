

public class q7_30 {
    public static void main(String[] args) {
        
        System.out.println("max(3,5,8)的結果為" + max(3, 5, 8));
        System.out.println("max(5, 99)的結果為" + max(5, 99));
        
    }
    public static int max(int a, int b, int c) {
    
        /*if(max(a,b) > c)
            return max(a, b);
        else
            return c;
        */
        //再優化版本
        return max(max(a,b),c);
    }

    public static int max(int a, int b) {
    
        if(a > b)
            return a;
        else
            return b;
    }
}
