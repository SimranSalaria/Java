public class prefixusingarr {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] prefixSum(int[] arr){
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];

        }
         return prefix;
    }
    public static void main(String[] args) {
        int []arr={2,3,4,5,6};
        System.out.println("Array :");
        printArray(arr);
        int prefix[]=prefixSum(arr);
        System.out.println("Prefix sum of array :");
        printArray(prefix);
    }
}
