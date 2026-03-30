public class q5_19{
    public static void main(String[] args){
        int i=1;

        while(i <= 9){
            int j =1;
            while(j <= 9){
                System.out.print( i + "*" + j + "=" + i*j);                
                System.out.print(" ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
}
