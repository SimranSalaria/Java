import java.util.Scanner;

public class spiralArr {
    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static void spiralOrder ( int a[][], int r, int c){
            int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
            int totalElements = 0;
            while (totalElements < r * c) {
                //topRow=leftCol to rightCol
                for (int j = leftCol; j <= rightCol && totalElements < r * c; j++) {
                    System.out.print(a[topRow][j] + " ");
                    totalElements++;
                }
                topRow++;
                //rightCol=topRow to bottomRow
                for (int i = topRow; i <= bottomRow && totalElements < r * c;i++) {
                    System.out.print(a[i][rightCol] + " ");
                    totalElements++;
                }
                rightCol--;
                //bottomRow=rightCol to leftCol
                for (int j = rightCol; j >= leftCol && totalElements < r * c; j--) {
                    System.out.print(a[bottomRow][j] + " ");
                    totalElements++;
                }
                bottomRow--;
                //leftCol=  bottomRow to topRow
                for (int i = bottomRow; i >= topRow && totalElements < r * c; i--) {
                    System.out.print(a[i][leftCol] + " ");
                    totalElements++;
                }
                leftCol++;
            }
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows and columns :");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int matrix[][] = new int[r][c];
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Input Array :");
            printArray(matrix);
            System.out.println("Spiral order of matrix :");
            spiralOrder(matrix,r,c);

        }
    }

