//Q8. 試撰寫一程式，利用 if 敘述判別所輸入的整數是否可以被 5 和 6 同時整除。
// 若是，則印出“可被 5 和 6 同時整除”，否則印出“無法被 5 和 6 同時整除”。

import java.util.Scanner;
public class q5_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個整數:");
        int num = scn.nextInt();
        if(num % 5 == 0 && num % 6 == 0)
            System.out.println( num + "可被 5 和 6 同時整除");
        else
            System.out.println(num+ "無法被 5 和 6 同時整除");
        scn.close();
    }
}
