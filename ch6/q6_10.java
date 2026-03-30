//import java.util.Scanner;

public class q6_10 {
    public static void main(String[] args) {
    
        char ch[] = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("轉型前，陣列為:");
        for(int i = 0; i < ch.length ; i++){
            System.out.printf("ch[%d] = %c\n", i, ch[i]);
        }
        for(int i = 0; i < ch.length ; i++){
            if(ch[i] > 'a' && ch[i] < 'z'){
                ch[i] = (char)(ch[i] - 32);
            }
            else if(ch[i] > 'A' && ch[i] < 'Z'){
                ch[i] = (char)(ch[i] + 32);
            }
        }
        System.out.println("轉換後的陣列:");
        for(char n: ch){
            System.out.print(n);
        }
    }
}
