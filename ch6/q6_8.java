//習題 8：依據另一陣列的索引排序
//這是一種「映射（Mapping）」的概念。
// 為了避免在原地修改時覆蓋掉尚未處理的資料，我們會建立一個新的陣列來存放結果。

public class q6_8 {
    public static void main(String[] args) {
        int arr[] = {12, 43, 56, 77};
        int ind[]={2, 0, 1, 3}; 
        int result[] = new int[arr.length];
        
        for(int i = 0; i < ind.length; i++){
            result[i] = arr[ind[i]];
        }
        System.out.println("排序後的陣列:");
        for(int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        //
        System.out.println("");
        //for(int i : result)
        //    System.out.println(i + " ");
    
    }
}
