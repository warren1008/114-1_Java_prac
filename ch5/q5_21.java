//Q21. 設 $f(n)=1+2+3+...+n，試找出滿足 f(n) >= 100 最小的 n。
public class q5_21 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while( sum <= 100){
            sum+= n;
            n++;
        }
        System.out.println("1+2+... +n >=100時，n最小值為" + (n-1));
        System.out.println("此時的值為" + sum);
    }
}
