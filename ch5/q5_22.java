//Q22. 老張養了一群兔子，但不知有幾隻。
// 三隻三隻數之，剩餘一隻；
// 五隻五隻數之，剩餘三隻；
// 七隻七隻數之，剩餘二隻；
// 試問最少有幾隻兔子？
public class q5_22 {
    public static void main(String[] args) {
        int rabbits = 1;
        //無窮迴圈
        while(true){
            if(rabbits % 3 == 1 && rabbits % 5 == 3 && rabbits % 7 == 2){
                
                break;
            }
            rabbits++;
        }     
        System.out.println("最少有" + rabbits + "隻兔子");
    }
}
