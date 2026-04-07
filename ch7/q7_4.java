import java.util.Scanner;
public class q7_4 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.print("請輸入正整數n:"); 
       int num = scn.nextInt();
       int result = sum(num);
       
       System.out.printf("從1累加到%d為%d\n", num, result);
       scn.close();
    }
    
    public static int sum(int n){
        int add = 0;
        for(int i = 1; i <= n;i++){
            add += i;
        }
        return add;
    }
}
