import java.util.Scanner;
public class q7_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean hasNextChar = true; 
        System.out.print("請輸入一個英文字母:");
        
        do{
            String str = scn.next();
            char ch = str.charAt(0);
            
            if(!hasNextChar){
                System.out.println("請重新輸入正確資料型態!!");
            }            
            else{
                char result = to_upper(ch);
                System.out.printf("to+upper(%s)的結果是:%s\n", ch, result);
            }
        }while(!hasNextChar);

        /* 另一種寫法
        Scanner scn =new scanner(System.in);
        System.out.print("請輸入一個英文字母:");
        char ch = str.next.charAt(0);
        
        char result = to_upper(ch);
        System.out.printf("原本是%s，轉換後變成%s\n", ch, result);
        scn.close();
        
        */
        scn.close();
    }

    public static char to_upper(char ch) {
        if( ch >= 'a' && ch <= 'z'){
            return (char)(ch - 32);
        }
        else
            return '@';
    }
}
