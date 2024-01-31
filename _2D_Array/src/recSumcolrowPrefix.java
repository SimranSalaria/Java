import java.util.Scanner;

public class recSumcolrowPrefix {
    public static void prefixSum(int a[][]) {
        int r = a.length;
        int c = a[0].length;
        //traversing horizontally to calculate row wise sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                a[i][j] += a[i][j - 1];
            }
        }
        //traversing vertically to calculate column wise sum
        for (int j = 0; j < c; j++) {//fixing column
            for (int i = 1; i < r; i++) {
                a[i][j] += a[i - 1][j];
            }
        }
    }
    public static int rectangleSum(int matrix[][],int l1,int r1,int l2,int r2){
        int ans=0,sum=0,up=0,left=0,upLeft=0;
        prefixSum(matrix);

        sum=matrix[l2][r2];

        if(r1>=1) {
            left = matrix[l2][r1 - 1];
        }
        if(l1>=1) {
            up = matrix[l1 - 1][r2];
        }
        if(l1>=1 && r1>=1) {
            upLeft = matrix[l1 - 1][r1 - 1];
        }
        ans = sum - up - left + upLeft;
        return ans;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number of rows and columns :");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int matrix[][] = new int[r][c];
            System.out.println("Enter " + r*c + " elements of the matrix :");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the coordinates from where we want to find the sum ans till which coordinate");
            System.out.println("Enter starting coordinates: ");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            System.out.println("Enter ending coordinates");
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();
            int ans=rectangleSum(matrix,l1,r1,l2,r2);
        System.out.println( "Sum of the rectangle " + ans);
    }
}
