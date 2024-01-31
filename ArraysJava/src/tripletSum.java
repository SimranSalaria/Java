public class tripletSum {
    static int targetSum(int arr[],int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int s=j+1;s<arr.length;s++){
                    if(arr[i]+arr[j]+arr[s]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,3};
        System.out.println("Number of triplets are :"+targetSum(arr,12));
    }
}
