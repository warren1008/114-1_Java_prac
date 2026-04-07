import java.util.Scanner;
public class q7_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個整數n來判斷其是否為質數:"); 
        int n = scn.nextInt();
        boolean result = is_prime(n);

        if(result)
            System.out.printf("%d是質數!!\n", n);
        else
            System.out.printf("%d不是質數!!\n", n);

        scn.close();
    }
    public static boolean is_prime(int n) {
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
