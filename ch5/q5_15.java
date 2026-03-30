//Q15. 試以 for 迴圈計算 1×2×3×...×10 的乘積。

public class q5_15 {
    public static void main(String[] args) {
        int product = 1;
        for(int i = 1; i <=10 ; i++){
            product *= i;
        }
        System.out.println("1×2×3×...×10 的乘積為:" + product);
    }
}

