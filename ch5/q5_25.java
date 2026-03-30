//小考考過!!
/*
Q25. 試利用巢狀 for 迴圈撰寫一程式來繪出下列各小題的數字/字母圖形。

a. RESULT
1
12
123
1234
12345
===
b. RESULT
5
54
543
5432
54321
===
c. RESULT
1
22
333
4444
55555
===
d. RESULT
0
12
345
6789
012345
===
e. RESULT
0
12
345
6789
abcde
===
*/
import java.util.Scanner;
public class q5_25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("===來印數字吧!!===");
        System.out.print("請鍵入(a)、(b)、(c)、(d)、(e)其中之一的對應字元值(a、b、c、d、e):");
        
        String str = scn.next();
        char ch = str.charAt(0);
        int i;
        int j;
        int count = 0;

        switch (ch){
            case 'a':
            case 'A':
                System.out.println("option: " + ch);
                for(i=1;i<=5;i++){
                    for(j=1;j<=i;j++){
                        System.out.print(j);
                    }  
                    System.out.println();
                }
                break;
            case 'b':
            case 'B':
                System.out.println("option: " + ch);
                for(i=5;i>=1;i--){
                    for(j=5;j>=i;j--){
                        System.out.print(j);
                    }   
                    System.out.println();
                }
                break;
            case 'c':
            case 'C':
                System.out.println("option: " + ch);
                for(i=1;i<=5;i++){
                    for(j=1;j<=i;j++){
                        System.out.print(i);
                    }   
                    System.out.println();
                }
                break;
            case 'd':
            case 'D':
                System.out.println("option: " + ch);
                for(i=1;i<=5;i++){
                    for(j=1;j<=i;j++){
                        System.out.print(count++ % 10);
                        /*or
                        System.out.print(count % 10);
                        couunt++;
                        */
                    }   
                    System.out.println();
                }
                break;
            case 'e':
            case 'E':
                //count = 0;
                System.out.println("option: " + ch);
                for(i=1;i<=5;i++){
                    for(j=1;j<=i;j++){
                        /*System.out.print(count % 10);
                        count++;
                        */
                        if(count<10){
                            System.out.print(count++);
                        }
                        else{
                            char ch1 = (char)('a' + count++%10);
                            //char ch2 = (char)('A' + count%10);
                            System.out.print(ch1);
                            //System.out.print("or" + ch2);


                        }
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
