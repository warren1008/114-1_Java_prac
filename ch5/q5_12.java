//Q12. 試輸入一個整數，如果範圍在 1~12 之間，則利用 switch 印出相對應的季節。
// 如果超出此範圍，則印出“月份不存在”：
// 3~5:春天、6~8:夏天、9~11:秋天、1、2、12:冬天。
import java.util.Scanner;
public class q5_12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入月份(1-12):");
        int month = scn.nextInt();
    
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println(month + "月是春天");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println(month + "月是夏天");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println(month + "月是秋天");
                break;

            case 1:
            case 2:
            case 12:
                System.out.println(month + "月是冬天");
                break;

            default:
                System.out.println("Warning : Invalid value !!");

           
        }
        scn.close();

       
    }
}
