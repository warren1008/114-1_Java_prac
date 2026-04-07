import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入螺旋矩陣的大小 N：");

        // 【防禦性程式設計】確保使用者輸入的是整數
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            // ==========================================
            // 第一階段：在 Heap 記憶體中建立 N x N 的二維陣列
            // ==========================================
            int[][] matrix = new int[n][n];

            // ==========================================
            // 第二階段：定義四個方向的邊界控制變數 (存放於 Stack)
            // ==========================================
            int top = 0;
            int bottom = n - 1;
            int left = 0;
            int right = n - 1;
            
            int num = 1; // 準備填入陣列的第一個數字

            // ==========================================
            // 第三階段：核心邏輯，開始螺旋填寫數字
            // ==========================================
            // 當準備填入的數字小於等於總格數 (N*N) 時，繼續執行
            while (num <= n * n) {
                // 1. 向右走 (行固定為 top，從 left 走到 right)
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = num++;
                }
                top++; // 最上面那列填完了，頂部邊界往下縮減一格

                // 2. 向下走 (列固定為 right，從 top 走到 bottom)
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = num++;
                }
                right--; // 最右邊那行填完了，右側邊界往左縮減一格

                // 3. 向左走 (行固定為 bottom，從 right 走到 left)
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--; // 最下面那列填完了，底部邊界往上縮減一格

                // 4. 向上走 (列固定為 left，從 bottom 走到 top)
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++; // 最左邊那行填完了，左側邊界往右縮減一格
            }

            // ==========================================
            // 第四階段：利用雙層迴圈將 Heap 中的陣列內容印出
            // ==========================================
            System.out.println("\n=== " + n + "x" + n + " 螺旋矩陣 ===");
            for (int i = 0; i < n; i++) {         // 外層迴圈控制 Row (列)
                for (int j = 0; j < n; j++) {     // 內層迴圈控制 Column (行)
                    // %3d 表示格式化為至少 3 個字元寬的整數，讓數字向右對齊
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println(); // 每一列印完後必須換行
            }

        } else {
            System.out.println("輸入錯誤：請輸入有效的整數！");
        }
        
        // 關閉資源
        sc.close();
    }
}
