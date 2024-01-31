import java.util.Scanner;

public class addArr {
    public static void printArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void add(int matrix1[][],int r1,int c1,int matrix2[][],int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong intput--> cannot perform addition");
            return;
        }
        int sum[][]=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Addition of the matrices:");
        printArr(sum);


    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter number of rows and columns :");
        int r1= s.nextInt();
        int c1=s.nextInt();
        int matrix1[][]=new int[r1][c1];
        System.out.println("Enter elements of the matrix");
        for(int i=0;i<r1;i++){
            for(int j =0;j<c1;j++){
                matrix1[i][j]=s.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter number of rows and columns :");
        int r2= s.nextInt();
        int c2=s.nextInt();
        int matrix2[][]=new int[r2][c2];
        System.out.println("Enter elements of the matrix");
        for(int i=0;i<r2;i++){
            for(int j =0;j<c2;j++){
                matrix2[i][j]=s.nextInt();
            }
            System.out.println();
        }
        System.out.println("Elements of the matrix 1:");
        printArr(matrix1);
        System.out.println("Elements of the matrix 2 :");
        printArr(matrix2);
        //calling to the function
        add(matrix1,r1,c1,matrix2,r2,c2);

    }

}
