//Q13. 試撰寫一程式，印出從 1 到 100 之間，所有可以被 16 整除的整數。
public class q5_13 {
    public static void main(String[] args) {
        int i;
        System.out.print("1-100之間，所有可以被16整除的整數有:");
        for(i = 1; i <= 100; i++){
            if(i % 16 != 0)
                //System.out.print(" " + i);
                continue;
            System.out.print(i +" ");
        }
    }
}
