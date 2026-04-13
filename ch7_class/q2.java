import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("請輸入一個字元:");
        
        String str = scn.next();
        char ch = str.charAt(0);
        System.out.print("印出結果:"+ to_upper(ch));

        scn.close();
    }
    public static char to_upper(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return (char)(ch -32);
        }
        else
            return '@';
    }
}
