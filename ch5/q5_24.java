//小考考過!!
//Q24. 試利用巢狀 for 迴圈撰寫一程式來繪出下列各小題的星號圖形。
/*a. RESULT
*****
****
***
**
*
===
b. RESULT
    *
   **
  ***
 ****
*****
===
c. RESULT
*****
 ****
  ***
   **
    *
===
d. RESULT
*****
^****
^^***
^^^**
^^^^*
===
*/
import java.util.Scanner;
public class q5_24 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("===來印星星吧!!===");
        System.out.print("請鍵入(a)、(b)、(c)、(d)其中之一的對應字元值(a、b、c、d):");
        
        String str = scn.next();
        char ch = str.charAt(0);

        int i;
        int j;
        int k;
        switch (ch){
            case 'a':
            case 'A':
                System.out.println("option: " + ch);
                for(i=1;i<=5;i++){
                    for(j=5;j>=i;j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 'b':
            case 'B':
                System.out.println("option: " + ch);
                for(i=1;i<=5;i++){
                    for(j=5;j>i;j--){
                        System.out.print(" ");
                    }   
                    for(k=1;k<=i;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 'c':
            case 'C':
                System.out.println("option: " + ch);
                for(i=1;i<=5;i++){
                    for(j=1;j<i;j++){
                        System.out.print(" ");
                    }   
                    for(k=5;k>=i;k--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 'd':
            case 'D':
                System.out.println("option: " + ch);
                for(i=1;i<=5;i++){
                    for(j=1;j<i;j++){
                        System.out.print("^");
                    }   
                    for(k=5;k>=i;k--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Warning : Invalid value !!");
        }
        scn.close();
    }
}
