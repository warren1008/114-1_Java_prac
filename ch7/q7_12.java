import java.util.Scanner;
public class q7_12 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("請輸入兩個整數計算其最小公倍數:");
        int x = scn.nextInt();
        int y = scn.nextInt();
        int result = lcm(x, y);
        System.out.printf("%d和%d的最小公倍數為:%d\n", x, y, result);
        scn.close();
    
    }
    public static int lcm(int m, int n) {
        int i = 1;
        while(i % m !=0 || i % n != 0){

        }
        
        
        return min;

    }
}
