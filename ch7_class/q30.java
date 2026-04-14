
public class q30 {
    public static void main(String[] args) {

        
        System.out.println("結果為:" + max(8,2));

        System.out.println("結果為:" + max(1,5,9));
        
    }
    
    public static int max(int a,int b){
        return (a>b) ? a:b;
    }

    public static int max(int a,int b, int c){
        return(a>max(b,c))? a: max(b, c);       
    }
    
}