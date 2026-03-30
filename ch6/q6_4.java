public class q6_4 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 0, 3, 2, 4, 1, 6, 8, 5, 4, 3, 2};

        //列印arr元素的個數
        int countArr = 0;
        int countRange = 0;
        
        for(int i:arr){
            countArr++;
            if (i >= 3 && i <= 6){
                countRange++;
            }
        }

        System.out.println("陣列arr元素的個數為" + countArr +"個");
        System.out.println("陣列arr中，介於3-6的元素個數為" + countRange +"個");
        System.out.println("===================");
    }
}
