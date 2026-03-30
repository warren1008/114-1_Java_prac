//輸入的字元是數字(1-9)  -----印出此字元是NUMBER
//輸入的字元是字母(a-z || A-Z)    ----印出此字元是ALPHABET

import java.util.Scanner;

public class q5_5 {
    public static void main(String[] args){

        /*Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個字元:");
        char ch = scn.next().charAt(0); //取得使用者輸入的第一個字元

        if(ch >= '0' && ch <= '9')
            System.out.println("你輸入的是數字 "+ (int)ch);
        
        scn.close();*/

        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個字元:");

        String str = scn.next();
        char ch = str.charAt(0);
        
        if(ch >= '0' && ch<= '9'){
            System.out.println("此字元是一個數字");
        }
        
        else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("此字元是一個字母");
        }

        else{
            System.out.println("此字元既不是字母或者數字");
        }
        scn.close();

    }
}
