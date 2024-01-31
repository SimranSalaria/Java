import java.util.Scanner;
//answer different queries in which from different index of array sum are asked i.e is sum from 2 to 4
public class pb1Prefix {
    public static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] prefixArray(int []a){

        for(int i=1;i<a.length;i++){
            a[i]+=a[i-1];
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        System.out.println("Enter elements of array :");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }

        int []pref=prefixArray(arr);

        System.out.println("Enter number of queries");
        int q=sc.nextInt();

        while(q-->0){
            System.out.println("Ask queries :");
            System.out.println("enter two bounds from where you want the sum");

                int l=sc.nextInt();
                int r= sc.nextInt();
               int ans = pref[r]-pref[l-1];
            System.out.println("sum"+ans);

        }
    }
}
