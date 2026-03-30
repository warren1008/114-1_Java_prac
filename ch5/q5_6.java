import java.util.Scanner;
public class q5_6 {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int number;
        do{
            System.out.print("請輸入一個整數:");
            number = scn.nextInt();
            if(number < 0)
                System.out.println("你輸入的整數小於0，請重新輸入");
        } while(number < 0);

        if(number % 2 == 0){
            System.out.println("您輸入的整數"+ number+ "是偶數");
        }
        else{
            System.out.println("您輸入的整數"+ number+ "是奇數");
        }
        scn.close();
    }
}
