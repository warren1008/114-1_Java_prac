import java.util.Scanner; // 助教修正 1：必須匯入 Scanner 類別，程式才知道去哪裡找它

public class q5_12v2 {
    public static void main(String[] args) {
        // 建立 Scanner 物件來接收鍵盤輸入
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一種動物:");
        
        // 讀取使用者輸入的字串，並擷取第一個字元
        String str = scn.next();
        char ch = str.charAt(0);
        
        // 判斷字元內容並輸出對應的叫聲
        if (ch == '貓') {
            System.out.println("喵喵叫");
        } else if (ch == '狗') {
            System.out.println("汪汪叫");
        } else if (ch == '羊') {
            System.out.println("咩咩叫");
        } else { // 助教修正 2：補上大括號 {}，養成良好的編碼習慣 (Coding Style)
            System.out.println("不明動物");
        }
        
        // 關閉資源
        scn.close();
    }
}