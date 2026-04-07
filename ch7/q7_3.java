import java.util.Scanner;

public class q7_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入整數n:");
        boolean hasNextInt = true;

        
        do{
            int number = scn.nextInt();
            if(!hasNextInt){
                System.out.println("請重新輸入正確資料型態 !!");
            }
            else {
                int result = cube(number);
                System.out.printf("%d的立方為%d\n", number, result);
            }
        }while(!hasNextInt);
        scn.close();
    }
    public static int cube(int x) {
        return x*x*x;
    }
}
