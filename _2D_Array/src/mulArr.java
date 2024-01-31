import java.util.Scanner;

public class mulArr {
    public static void printMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void multiplyArray(int a[][],int r1,int c1,int b[][],int r2,int c2){
        int multiply[][]=new int [r1][c2];
        for(int i=0;i<r1;i++){//row number
            for(int j=0;j<c2;j++){//column number
                for(int k=0;k<c1;k++){
                    //multiply[i][j]=ith row of a * jth column of the b
                    multiply[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication of the matrices :");
        printMatrix(multiply);
    }
    public static void main(String[] args) {
        //condition--> number of the columns(c1) of the matrix 1 should be equal to the rows(r2) of the matrix 2.
        //dimension of the resulting array should be r1*c2.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]matrix1=new int[r1][c1];
        System.out.println("Enter elements of the matrix :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns :");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][]matrix2=new int[r2][c2];
        System.out.println("Enter elements of the matrix :");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of the first matrix");
        printMatrix(matrix1);
        System.out.println("Elements of the second matrix :");
        printMatrix(matrix2);

        multiplyArray(matrix1,r1,c1,matrix2,r2,c2);

    }
}
