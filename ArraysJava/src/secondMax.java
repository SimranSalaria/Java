public class secondMax {
    static int max(int []arr){
        int x=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
            }
        }
        return x;
    }
    static int secondMax(int arr[]){
        int mx=max(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMt=max(arr);
        return secondMt;
    }
    public static void main(String[] args) {
        int arr[]={1,5,9,3,9,7,8,4,8};
        System.out.println("Second maximum element : "+secondMax(arr));

    }
}
