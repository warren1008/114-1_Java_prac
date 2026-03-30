//Q11. 試輸入一個 1~7 之間的整數 day，代表星期一到星期日。
// 若 day 的值是 1~5，則印出“今天要上班上課”，
// 若 day 的值是 6~7，則印出“今天休息”，
// 若 day 的值不是 1~7，則印出“輸入錯誤”。
import java.util.Scanner;
public class q5_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("plz enter value what day is today:");
        int day = scn.nextInt();
        if(day >= 1 && day <= 5)
            System.out.println("今天上班上課");
        else if(day == 6 || day == 7)
            System.out.println("今天休息");
        else
            System.out.println("輸入錯誤");
        scn.close();
    }
    
}