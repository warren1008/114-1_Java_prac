/*
Q28. 
設 f(n)=1^2+2^2+3^2+...+n^2，
試找出滿足 f(n)<320 的最大整數 n。
請以 for 迴圈配合 break 敘述來撰寫。
*/
public class q5_28 {
    public static void main(String[] args) {
        int i,sum = 0;
        System.out.print("f(n)=1^2+2^2+3^2+...+n^2 <320的的最大整數:");
        for(i = 1 ; /* 判斷條件為空 */ ; i++){
            sum += i * i;
            if(sum >= 320){
                i = i - 1;//退回上一個n
                break;
            }
        }
        System.out.println(i);
    }
}
