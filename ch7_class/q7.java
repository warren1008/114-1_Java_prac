import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        
        System.out.println("可以被9整除的偶數有:");
        for(int i = 1; i <= 100;i++){
            if(is_even(i) &&i % 9==0){
                System.out.print(i+" ");
        }
        }
        scn.close();

    }
    public static boolean is_even(int n) {
        return n%2 == 0;
    }
}

