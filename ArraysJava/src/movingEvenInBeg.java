public class movingEvenInBeg {
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void evenInBeg(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]%2!=0&&arr[j]%2==0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2!=0){
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,8};
        System.out.println("Original array : ");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        evenInBeg(arr);
        System.out.println("Array after moving even in front :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


