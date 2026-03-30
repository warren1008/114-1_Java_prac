//Q9. 試利用巢狀的 if 敘述設計一程式，可從鍵盤輸入學生成績，輸出為成績的等級。
// 學生成績依下列的分類方式分級：80-100:A級、60-79:B級、0-59:C級。
import java.util.Scanner;
public class q5_9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int score;
        do{
            System.out.print("請輸入學生成績:");
            score = scn.nextInt();
        }while(score < 0 || score > 100);

        if(score >= 80 && score <= 100)
            System.out.println("A級");
        else if(score >= 60 && score <= 79)
            System.out.println("B級");
        else
            System.out.println("C級");
        scn.close();


    }
}
