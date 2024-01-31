import java.util.Scanner;

public class prefixsum {
    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] makePrefixArray(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");
        int element= sc.nextInt();
        int arr[]=new int[element];
        System.out.println("Enter elements of the array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array :");
        printArray(arr);
        int[]result=makePrefixArray(arr);
        System.out.println("Prefix sum array :");
        printArray(result);


    }
}
