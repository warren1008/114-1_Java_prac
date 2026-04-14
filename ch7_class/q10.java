import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入一個整數:");
        int num = scn.nextInt();
        System.out.printf("小於等於%d的所有質數有:", num);
        primes(num);
        
        scn.close();
    }
    public static void primes(int n) {
        for(int i=2; i < n; i++){
            
            for(int j = 2; j < i ; j++){
                if(i % j ==0){
                    continue;
                }
                
            }
            System.out.print(i +" ");
            
        }      
    }
}
