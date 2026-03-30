import java.util.Scanner;

public class q5_4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.print("請輸入一個數字: ");
        int number = scn.nextInt();
        
        int absNumber;
        if (number < 0)
            absNumber = -number;
        else
            absNumber = number;

        System.out.println("The abs of the " + number + " is:" + absNumber);

        scn.close();
    }
 

}
