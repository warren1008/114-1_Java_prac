import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in);

        System.out.println("請輸入兩個整數:");
        
        System.out.print("整數1"+": ");
        int num1 = scn.nextInt();

        System.out.print("整數2"+": ");
        int num2 = scn.nextInt();
        
        System.out.printf("%d和%d的最大公因數為:%d\n", num1, num2, gcd(num1, num2));
        scn.close();
    }
    public static int gcd(int m,int n) {
        int min = (m < n) ? m: n;
        int maxGcd = 1;
        for(int i =1; i <= min; i++){
            if( m % i == 0 && n % i == 0){
                maxGcd = i;
            }
        }
        return maxGcd;
    }
}
