public class swap_3Varaiable {
    static void swap(int arr[]){
        for(int j=0;j<arr.length-1;j++){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

        }
        System.out.println("After swapping : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,9};
        System.out.println("Before swapping : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        swap(arr);
    }
}
