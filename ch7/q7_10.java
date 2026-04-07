import java.util.Scanner;
public class q7_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("請輸入一個整數n來印出小於等於它的所有質數:"); 
        int n = scn.nextInt();
        
        primes(n);
        scn.close();
    }
    public static void primes(int n) {
        System.out.printf("小於等於%d的質數有:\n", n);
        if(n == 1){
            System.out.println("請重新輸入大於1的數:");
        }
        for(int i = 2; i <= n;i++){      
            if(is_prime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static boolean is_prime(int n){
        if(n <= 1)
            return false;
        for(int i = 2; i < n; i++){
            if(n % i ==0)
                return false;
        }
        return true;
    }
}

