import java.util.Scanner;

public class q5_29v2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int correctPassword = 6128;
        boolean isSuccess = false; // 紀錄是否登入成功的旗標 (Flag)
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("請輸入密碼: ");
            int input = scn.nextInt();
            
            if (input == correctPassword) {
                System.out.println("密碼輸入正確，歡迎使用本系統!");
                isSuccess = true;
                break; // 密碼對了就直接中斷迴圈，不用再輸入了
            } else {
                // 如果不是最後一次機會，才印出重新輸入的提示
                if (i < 3) {
                    System.out.println("密碼輸入錯誤，請重新輸入密碼:");
                }
            }
        }
        
        // 迴圈結束後，檢查是否是因為三次都錯而結束的
        if (!isSuccess) {
            System.out.println("密碼輸入超過三次!");
        }
        
        scn.close();
    }
}