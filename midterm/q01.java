/* generate the result below through input intergr n:
    1   i=1, void = input-i, num = i
   12   i=2,  
  123   i=3,
 1234   i=4
12345   i=5 ====
 1234   j=1 void = J, num = input - j 
  123   j=2
   12   j=3
    1   j=4
=====
input = 5;
    1           i = 1,voidL = input - i,numL = i,numR = i - 1, voidR = input - 1
   121          i = 2
  12321         i = 3
 1234321        i = 4
123454321       i = 5===
 1234321        j = 1,voidL = j,numL = input - j,numR = input - j - 1 , voidR = j
  12321         j = 2
   121          j = 3
    1           j = 4
=====

*
**
*.*
*..*
*...*
*....*
*******

==========
01234543210
01234 43210
0123   3210
012     210
01       10
0         0
01234543210
*/
import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        System.out.println("===圖形生成===");
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個正整數n:"); 
        if(scn.hasNextInt()){       
        int input = scn.nextInt();
        //上半段
        for(int i = 1; i <= input; i++){
            for(int j = input; j > i; j--){
                System.out.print(" ");
            }
            
            for(int k = 1; k <= i; k++){
                System.out.print(k);
            }
            
            System.out.println();
        }
        //下半段
        for(int i = 1 ; i < input; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= input - i;k++){
                System.out.print(k);
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("===菱形===");
        
/* 初值 終值 規律 
                input = 5;
    1           i = 1,voidL = input - i,numL = i,numR = i - 1, voidR = input - 1
   121          i = 2
  12321         i = 3
 1234321        i = 4
123454321       i = 5===
 1234321        j = 1,voidL = j,numL = input - j,numR = input - j - 1 , voidR = j
  12321         j = 2
   121          j = 3
    1           j = 4
=====
*/

        //上半段，假設input = 5;
        for (int i = 1; i <= input; i++){
            for(int voidL = 1; voidL <= input - i ;voidL++){
                System.out.print("=");//數量為input - i;
            }
            
            for(int numL = 1 ; numL <= i ; numL++){
                System.out.print(numL); //從1印到i;
            }
            
            for(int numR = i - 1; numR  >= 1; numR--){
               System.out.print(numR); //從i-1倒退印到1
            }   

            for(int voidR = 1; voidR <= input - i ; voidR++){
                System.out.print("=");//數量為input -i
            }
            System.out.println();
        }
        //下半段
/*
123454321
 1234321        j = 1,voidL = j,numL = input - j,numR = input - j - 1 , voidR = j
  12321         j = 2
   121          j = 3
    1           j = 4
*/
        for(int i = 1; i < input; i++){
            for(int voidL = 1; voidL <= i; voidL++){//數量從1印到i
                System.out.print("=");
            }
            for(int numL = 1;numL <= input - i ;numL++){//從1印到input - 1
                System.out.print(numL);
            }
            for(int numR = input - i - 1; numR >= 1; numR--){//從i - 1 印到1
                System.out.print(numR);
            }
            for(int voidR = 1; voidR <= i;voidR++){//數量為i，從1印到i
                System.out.print("=");
            }
            System.out.println();
        }

        System.out.println("===三角形===");
/* 
三角形
頂部
*
中部
**
*.*
*..*
*...*
*....*
底部
*******
*/
        //頂部
        System.out.println("*");
        //中部
        for(int i = 1 ; i <= input ; i++){
            System.out.print("*");

            for(int j = 1 ; j < i;j++){
                System.out.print(".");
            }
            System.out.println("*");
        }
        //底部
        for(int i = 1; i<=input +2;i++){
            System.out.print("*");
        }
        System.out.println();
    
        System.out.println("===數字圖形===");
/*
        頂部
01234543210 void = 0    
        中部
01234.43210 void = 1    i=1
0123...3210 void = 3    i=2
012.....210 void = 5    i=3
01.......10 void = 7    i=4
0.........0 void = 9    i=5
        底部
01234543210 void = 0    
    

*/
        //頂部
        for(int topL = 0; topL <= input;topL++){
            System.out.print(topL);
        }
        for(int topR = input - 1; topR >=0; topR--){
            System.out.print(topR);
        }
        System.out.println();

        //中部
        for(int i = 1; i <= input; i++){
            for(int numL = 0; numL <= input - i; numL++){
                System.out.print(numL);
            }
            for(int voidL = 1; voidL <= i;voidL++){
                System.out.print(".");
            }
            for(int voidR = 1; voidR<= i - 1;voidR++){
                System.out.print(".");
            }

            for(int numR = input -i; numR >=0; numR--){
                System.out.print(numR);
            }
            System.out.println();
        }

        //底部
        for(int bottomL = 0; bottomL <= input;bottomL++){
            System.out.print(bottomL);
        }
        for(int bottomR = input- 1; bottomR >=0; bottomR--){
            System.out.print(bottomR);
        }
        System.out.println();
        System.out.println("=====程式執行結束!!=====");
        }
        scn.close();
    }
}
