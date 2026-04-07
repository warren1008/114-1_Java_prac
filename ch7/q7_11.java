//找出最大公因數
import java.util.Scanner;

public class q7_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            
        System.out.println("請輸入兩個整數計算最大公因數:");
        int m = scn.nextInt();
        int n = scn.nextInt();
        int result = gcd(m, n);
        System.out.printf("%d和%d的最大公因數為:%d\n", m, n, result);
             
        scn.close();
    }
    
    public static int gcd(int n, int j){
        int min = n;
        int temp = 1;
        if(j < n)
            min = j;

        for(int i = 1;i<= min;i++){
            if(n % i == 0 && j % i == 0){
                temp = i;
            }
            
        }
        return temp;
    }
}
