import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入一個整數:");
        int num = scn.nextInt();
        System.out.printf("可以被%d整除的因數有:",num);
        factors(num);
        scn.close();
    }
    public static void factors(int n) {
        for(int i = 1; i<=n ; i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
