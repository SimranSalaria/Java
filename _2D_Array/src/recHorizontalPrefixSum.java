import java.util.Scanner;

public class recHorizontalPrefixSum {
    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void prefixSum(int a[][]){
        int r=a.length;
        int c=a[0].length;
         //traverse horizontally to find row wise sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                a[i][j]+=a[i][j-1];//i just specify we are on which row same like prefix in 1d array
            }
        }
    }
    public static int sumRectangle(int[][] matrix,int l1,int r1,int l2,int r2) {
        int sum = 0;
        prefixSum(matrix);
        //we have to travel to all the rows
        for (int i = l1; i <= l2; i++) {
            //this for loop calculate sum for r1 to r2 for row i
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            } else {
                sum += matrix[i][r2];
            }

        }
        return sum;
    }

        public static void main (String[]args){
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
            int sum=sumRectangle(matrix,l1,r1,l2,r2);
            System.out.println(sum);

        }
    }

