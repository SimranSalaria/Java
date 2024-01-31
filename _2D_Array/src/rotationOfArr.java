import java.util.Scanner;

public class rotationOfArr {
    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            //swapping
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotateArr(int matrix[][], int n) {//n=number of rows or columns as it is a square matrix
        // step 1.transpose
        //step 2. reverse
        transposeMatrix(matrix, n, n);
        for (int i = 0; i < n; i++) {
            reverseArray(matrix[i]);

        }
    }
        public static void transposeMatrix ( int matrix1[][], int r1, int c1){//inplace code
            for (int i = 0; i < r1; i++) {
                for (int j = i; j < c1; j++) {
                    int temp = matrix1[i][j];
                    matrix1[i][j] = matrix1[j][i];
                    matrix1[j][i] = temp;
                }
            }
        }
        public static void main (String[]args){
            // here it is given in the question that square matrix is given as input r1=c1
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows and columns :");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int matrix1[][] = new int[r1][c1];
            System.out.println("Enter elements of the matrix :");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("MATRIX :");
            printArray(matrix1);

            rotateArr(matrix1,r1);
            System.out.println("Rotation of matrix");
            printArray(matrix1);

        }

}

