/*
Q29. 試撰寫一程式，
利用 break 敘述來撰寫密碼輸入的過程。
使用者有三次的輸入機會，密碼為 6128。
*/
import java.util.Scanner;
public class q5_29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int correctPassword = 6128;
        boolean isSuccess = false;
        int i;
        System.out.print("請輸入密碼:");
        for(i = 1 ; i <= 3 ; i++){
            int input = scn.nextInt();
            if (input == correctPassword){
                System.out.println("密碼輸入正確，歡迎使用本系統");
                isSuccess = true;
                break;
            }
            else{
                /*if(i == 3){
                    //isSuccess = false;
                    //this code line is redundant code !!
                    break;
                }
                else*/
                if(i < 3)
                    System.out.print("密碼輸入錯誤，請重新輸入密碼:");
            }
        }
        if (!isSuccess)
                System.out.println("密碼輸入超過三次 !");
        scn.close();        
    }
}
