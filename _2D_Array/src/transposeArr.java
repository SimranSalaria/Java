import java.util.Scanner;

public class transposeArr {
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeFun(int a[][],int r1,int c1){

//        int transpose[][]=new int [r1][c1];
//        for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                transpose[i][j]=a[j][i];
//            }
//        }
//        return transpose;
        //transpose using same array
        //only square matrix can be transpose using this method
        for(int i=0;i<r1;i++){//number of the rows
            for(int j=i;j<c1;j++){//number of the columns
                //swapping
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;

            }
        }
        return a;
    }

    //using extra array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns :");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int matrix1[][]=new int [r1][c1];
        System.out.println("Enter elements of the matrix :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

//        System.out.println("Enter number of rows and columns :");
//        int r2=sc.nextInt();
//        int c2=sc.nextInt();
//        int matrix2[][]=new int [r1][c1];
//        System.out.println("Enter elements of the matrix :");
//        for(int i=0;i<r2;i++){
//            for(int j=0;j<c2;j++){
//                matrix2[i][j]=sc.nextInt();
//            }
//        }
        System.out.println("Matrix :");
        printArray(matrix1);
        int[][] transpose=transposeFun(matrix1,r1,c1);
        System.out.println("Transpose of a matrix :");
        printArray(transpose);
    }
}
