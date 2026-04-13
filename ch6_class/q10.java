public class q10 {
    public static void main(String[] args) {
        char chr[] ={'H','e','l','l','o'};
        System.out.print("轉換前:");

        for(char i : chr){
            System.out.print(i);
        }

        for(int i = 0; i <chr.length; i++){
            if(chr[i] >= 'a' && chr[i] <= 'z'){
                chr[i] = (char)(chr[i] - 32);
            }
            
            else if(chr[i] >= 'A' && chr[i] <= 'Z'){
                chr[i] = (char)(chr[i] + 32);
            }
        }

        System.out.print("轉換後:");
        for(char i: chr){
            System.out.print(i);
        }
    }
}
