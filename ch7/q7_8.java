import java.util.Scanner;
public class q7_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入整數n:"); 
        int n = scn.nextInt();

        System.out.printf("整數%d的因數有:", n);
        factors(n);
    
        scn.close();
    }
    public static void factors(int n) {
        for(int i = 1; i <= n; i++){
            if(n % i ==0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
}
