import java.util.Scanner;

public class pascalTriangle {
    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [][]pascalTri(int n){
        int result[][]=new int [n][];
        for(int i=0;i<n;i++){
            result[i]=new int [i+1];//initializing number of the columns ot 1d array
            result[i][0]=result[i][i]=1;
            for(int j=1;j<i;j++){//j<i because already filled ith column
                result[i][j]=result[i-1][j]+result[i-1][j-1];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();
        int result[][]=pascalTri(n);
        printArray(result);
    }
}
