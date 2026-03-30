//Q23. 試撰寫一程式，可以輸入一個整數。
// 如果 n >= 0，則印出此數的平方，然後要求使用者輸入下一個整數，以此循環。
// 如果 n < 0，則結束程式的執行。
//do-while loop
import java.util.Scanner;
public class q5_23v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("請輸入一個整數:");
            num = scn.nextInt();
            int square = num*num;
            if(num >= 0)
                System.out.println(num +"的平方為" + square);

        }while(num >= 0);
        System.out.println("程式執行已結束!!");
        scn.close();
    }
}
