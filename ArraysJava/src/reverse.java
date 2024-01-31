public class reverse {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println("Array : ");
        for(int h=0;h<arr.length;h++){
            System.out.print(arr[h]+" ");
        }
        System.out.println();
        int x=arr.length;
        int mid=arr.length/2;
        for(int i=0;i<mid;i++){
            for(int j=x-1;j>mid;j--){
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Array after reversing:");
        for(int s=0;s<arr.length;s++){
            System.out.print(arr[s]+" ");
        }
    }
}
