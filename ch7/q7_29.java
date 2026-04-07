import java.util.Scanner;

public class q7_29 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        
        System.out.print("請輸入三角形的整數底:");
        int baseInt = scn.nextInt();

        System.out.print("請輸入三角形的整數高:");
        int heightInt = scn.nextInt();
        
        // 【修正 1】因為 triangle 傳回的是 float，所以接收的變數也必須宣告為 float
        float areaInt = triangle(baseInt, heightInt);
        System.out.printf("底%d 高%d 面積為%.2f\n", baseInt, heightInt, areaInt);

        System.out.print("請輸入三角形的小數底:");
        float baseFloat = scn.nextFloat();

        System.out.print("請輸入三角形的小數高:");
        float heightFloat = scn.nextFloat();
        
        float areaFloat = triangle(baseFloat, heightFloat);

        System.out.printf("底%.2f 高%.2f 面積為%.2f\n", baseFloat, heightFloat, areaFloat);
        scn.close();

    }

    public static float triangle(int base, int height) {
        return base * height / 2.0f;    
    }

    public static float triangle(float base, float height) {
        return base * height / 2.0f;  
    }


}