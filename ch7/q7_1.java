import java.util.Scanner;
public class q7_1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("你要輸出幾行:");
        boolean hasNextInt = true;
        
        //int n = scn.nextInt();
        
        do{
            int n =scn.nextInt();
            if(!hasNextInt){
                System.out.println("請重新輸入正確資料型態");
            }
            if(hasNextInt){
                greeting(n);
            }
        
        }while(!hasNextInt);
        scn.close();
    }
    public static void greeting(int k) {
        for (int i = 1; i <= k ;i++){
            System.out.println("Hello, Java!");
        }
    }
}