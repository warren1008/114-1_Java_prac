import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("你要輸出幾行:");
        int row = scn.nextInt();
        greeting(row);
        scn.close();
    }
    public static void greeting(int k){
        for(int i = 1; i <= k; i++){
            System.out.println("Hello Java!");
        }
    }
}
