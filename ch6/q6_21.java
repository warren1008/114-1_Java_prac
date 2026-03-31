public class q6_21 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {9, 8, 7, 6};
        System.out.println("調換前，陣列a的內容有:");
        
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();
        
        System.out.println("調換前，陣列b的內容有:");
        
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] +" ");
        }
        System.out.println();
        
        
        //進行調換過程
        int temp[] = new int[4];
        for(int i = 0; i < a.length / 2; i++){
            temp[i] = a[i];
            a[i] = b[i];
            b[i] = temp[i];
        }

        System.out.println("調換後，陣列a的內容有:");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();
        

        System.out.println("調換後，陣列b的內容有:");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] +" ");
        }
        System.out.println();
    
    }   
}
