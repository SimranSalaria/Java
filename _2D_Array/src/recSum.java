import java.util.Scanner;

public class recSum {
    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumRec(int matrix[][],int l1,int r1,int l2,int r2 ){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and columns :");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("Enter elements of the matrix :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix:");
        printArray(matrix);

        System.out.println("Enter the coordinates from where we want to find the sum ans till which coordinate");
        System.out.println("Enter starting coordinates: ");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        System.out.println("Enter ending coordinates");
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        int sum=sumRec(matrix,l1,r1,l2,r2);
        System.out.println("Sum of the given coordinates of the rectangle = " +sum);
    }
}
