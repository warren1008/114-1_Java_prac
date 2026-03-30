/*Q27. 
試找出 0~100 的整數中，
所有可以被 2 與 3 整除，但不能被 12 整除的整數。
試利用 continue 敘述來完成這個程式。

*/
public class q5_27 {
    public static void main(String[] args) {
        int i;
        System.out.println(" 0~100 的整數中，所有可以被 2 與 3 整除，但不能被 12 整除的整數:");
        for(i = 0 ; i <= 100 ; i++){
            if(( i % 2 == 0 && i % 3 == 0) && ( i % 12 != 0)){
                System.out.print(i + " ");        
                continue;
            }
        }
    }
}
