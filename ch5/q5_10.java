//Q10. 試撰寫一程式，由程式中宣告並設定三個整數的初值，
// 然後判別這三個整數是否能構成三角形的三個邊長
// (註：三角形兩邊長之和必須大於第三邊)。
import java.util.Scanner;
public class q5_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = 3.56, b = 13.58, c= 8.45; 
        System.out.println("(a,b,c)=(" + a+ "," + b + "," + c + ")");

        if((a+  b > c) && (b + c > a) && (c + a > b))
            System.err.println("a=" + a +" b=" +b + " c="+c + "可以構成三角形");
        else
            System.err.println("a=" + a +" b=" +b + " c="+c + "不可以構成三角形");
        scn.close();
    }
}
