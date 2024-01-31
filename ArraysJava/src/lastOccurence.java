import java.util.Scanner;

public class lastOccurence {
    static int lastOccurrence(int[] a, int x) {
        int idx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                idx = i;
            }

        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements to be displayed in array :");
        int n = sc.nextInt();
        System.out.println("Elements=" + n);

        int[] arr = new int[n];
        System.out.println("Enter " + n + "elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter element to be find last occurence");
        int x = sc.nextInt();
        System.out.println("Last occurrence="+lastOccurrence(arr, x));

    }
}
