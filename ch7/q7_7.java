//找出1-100裡面可以被9整除的數
//import java.util.Scanner;
public class q7_7 {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        //System.out.print("請輸入整數n:"); 
        //int n = scn.nextInt();
        
        
        System.out.print("1-100裡面可以被9整除的偶數:");
        /*if(result){
            System.out.printf("%d是偶數\n", n);
        }
        else{
            System.out.printf("%d不是偶數\n", n);
        }
        */
        
        for(int i =1; i <=100; i++){

            boolean result = is_even(i);
            
            if(result && i % 9 == 0)
                System.out.println(i+ " ");    
        }
        System.out.println();
    //    scn.close();
    }
    public static boolean is_even(int n) {
        boolean isEven = true;
        if(n % 2 ==0){
            isEven = true;
        }
        else
            isEven = false;
        return isEven;
    }
}
