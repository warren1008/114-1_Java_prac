//Q23. 試撰寫一程式，可以輸入一個整數。
// 如果 n >= 0，則印出此數的平方，然後要求使用者輸入下一個整數，以此循環。
// 如果 n < 0，則結束程式的執行。
import java.util.Scanner;
public class q5_23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int square;
        int count = 0;
        while(true){
            count++;
            System.out.print("請輸入第" + count + "一個整數:");
            int num = scn.nextInt();
            
            if(num < 0){
                System.out.println("很抱歉!您輸入的數是負整數~");
                break;
            }
            else{
                square = num*num;
                System.out.println(num + "的平方為"+ square);
            }
        }
        scn.close();
    }
}

//用while迴圈
