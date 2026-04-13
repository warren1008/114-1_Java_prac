import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入一個整數:");
        int num = scn.nextInt();
        if(is_even(num))
            System.out.println(num+"是偶數");
        else
            System.out.println(num+"不是偶數");

        scn.close();

    }
    public static boolean is_even(int n) {
        return n%2 == 0;
    }
}
