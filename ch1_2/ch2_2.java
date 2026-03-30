import java.util.Scanner;
public class ch2_2 {
    public static void main(String[] args){
        char grade = 'A';
        double height = 175.5;  
        System.out.printf("你的預設等級是%c,你的身高是%.1fcm,你是個好學生!!\n",grade,height);

        //讀取鍵盤輸入
        Scanner scn = new Scanner(System.in);

        System.out.print("請輸入你的年齡:");
        int age =scn.nextInt();

        System.out.println("你今年" + age + "歲");
        scn.close();
    }
}
