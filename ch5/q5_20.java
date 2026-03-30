//Q20. 試輸入一個整數，然後判斷輸入的數是幾個位數的整數。//
//  提示：一個整數用整數除法除以 10，其位數會少一位
import java.util.Scanner;

public class q5_20 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個整數:");
        int number = scn.nextInt();
        
        if (number == 0){
            System.out.println("1個位數的整數");
        }
        else{
            int count = 0;
            int temp = number;//暫時存放的變數

            while (temp != 0){
                temp /= 10;
                count++;
            }
            System.out.println(number+ "是" + count + "個位數的整數");
        }
        scn.close();
        
    }
}
