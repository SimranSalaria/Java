import java.util.Scanner;

public class pb2Prefix {
    public static int totalSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean partitionSp(int arr[]) {
        int total = totalSum(arr);
        int prefix = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];
            int suffix = total - prefix;
            if (prefix == suffix) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition possible :" + partitionSp(arr));
    }
}