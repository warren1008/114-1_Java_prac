import java.util.Scanner;
public class q7_25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入正整數n:");
        int n = scn.nextInt();
        
        System.out.printf("第%d個迴圈費氏值為:%d\n", n, fib_for(n));
        System.out.println("前50個迴圈費氏值依序:");
        long startTime = System.currentTimeMillis();
        for(int i = 1;i <=30 ; i++){
            System.out.printf("fib_for(%d) = %d\n", i, fib_for(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("迴圈版耗時: " + (endTime - startTime) + " 毫秒\n");
        System.out.println("===============");

        
        System.out.printf("第%d個遞迴費氏值為:%d\n", n, fib_rec(n));
        

        System.out.println("前50個遞迴費氏值依序:");
        startTime = System.currentTimeMillis();
        for(int i = 1;i <=30 ; i++){
            System.out.printf("fib_rec(%d) = %d\n", i, fib_rec(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("遞迴版耗時: " + (endTime - startTime) + " 毫秒\n");
        System.out.println("===============");

        scn.close();

    }
    public static long fib_for(int n) {
        
        if(n == 1 || n == 2){
            return 1;
        }
        
        long a = 1, b =1, current = 0;
        for(int i = 3;i <=n; i++){
            current = a + b; //前兩項的和
            a = b;    //將後項的值變成前項
            b = current; 
        }
        return current;
    }
    public static long fib_rec(int n) {
        if(n == 1 || n ==2){
            return 1;
        }
        else
            return (fib_rec(n-1) + fib_rec(n-2));
    }
}
