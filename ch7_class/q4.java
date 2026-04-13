import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        System.out.print("請輸入一個整數:");
        int num = scn.nextInt();
        System.out.printf("1+2+...+%d的結果為:%d\n",num,sum(num));
        scn.close();

    }
    public static int sum(int n) {
        int sum =0;
        for(int i = 1;i <=n;i++){
            sum+=i;
        }
        return sum;
    }
}
