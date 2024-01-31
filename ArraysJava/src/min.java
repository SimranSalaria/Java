public class min {
    public static void main(String[] args) {
        int arr[]={2,1,4,3,9,7};
        int x=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                x=arr[i];
            }
        }
        System.out.println("Minimum element in the array : "+ x);
    }
}
