//Q7. 試撰寫一程式，可輸入一個整數，然後以條件運算子來計算該整數的絕對值。
import java.util.Scanner;
public class q5_7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number;
        
        do{
            System.out.print("Please enter an interher which is positive:");
            number = scn.nextInt();
            if (number < 0);
                System.out.println("!! Warning : Plz reenter the integer");
        }
        while(number < 0);
        System.out.println("你輸入的整數為" + number);
        int absValue = (number < 0) ? -number : number;

        System.out.println("你輸入的整數之絕對值為:"+ absValue);
        scn.close(); 
    }    
}
