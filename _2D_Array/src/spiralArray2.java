import java.util.Scanner;
// given a positive integer n,generate a n*n matrix filled with elements from 1 to n^2 in spiral order
public class spiralArray2 {
    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralMatrix( int n) {
        int topRow = 0, bottomRow = n- 1, leftCol = 0, rightCol = n - 1;
        int curr=1;
        int ans[][]=new int[n][n];

        while (curr <= n * n) {
            //topRow=leftCol to rightCol
            for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {//curr<=  because we start curr from 1
                ans[topRow][j]=curr++;
            }
            topRow++;
            //rightCol=topRow to bottomRow
            for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
                ans[i][rightCol]=curr++;
            }
            rightCol--;
            //bottomRow=rightCol to leftCol
            for (int j = rightCol; j >= leftCol && curr <=n * n; j--) {
                ans[bottomRow][j]=curr++;

            }
            bottomRow--;
            //leftCol=  bottomRow to topRow
            for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
                ans[i][leftCol]=curr++;
            }
            leftCol++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int n = sc.nextInt();
        System.out.println("Spiral matrix :");
        int ans[][]=spiralMatrix(3);
        printArray(ans);
    }
}
