import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入一個整數:");
        int num = scn.nextInt();
        if(is_prime(num)){
            System.out.println(num +"是質數");
        }
        else{
            System.out.println(num +"不是質數");
        }
        scn.close();
    }
    public static boolean is_prime(int n) {
        for(int i = 2; i < n; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
}
