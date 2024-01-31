import java.util.Scanner;

public class printArr {
    public static void printingA(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int arr[][] = {
//                {2, 3, 4},
//                {5, 6, 7},
//                {8, 9, 0},
//        };
//        System.out.println("ARRAY :");
//        printingA(arr);
//    }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();
        int arr2[][] = new int[r][c];
        System.out.println("Enter" + r*c + " element of array  ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        printingA(arr2);
    }
}

