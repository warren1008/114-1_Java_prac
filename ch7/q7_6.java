import java.util.Scanner;
public class q7_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入整數n:"); 
        int n = scn.nextInt();
        boolean result = is_even(n);
        
        if(result){
            System.out.printf("%d是偶數\n", n);
        }
        else{
            System.out.printf("%d不是偶數\n", n);
        }
        scn.close();
    }
    public static boolean is_even(int n) {
        /*boolean isEven = true;
        if(n % 2 ==0){
            isEven = true;
        }
        else
            isEven = false;
        return isEven;*/
        return (n % 2 == 0);
    }
}
