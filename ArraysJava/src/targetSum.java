public class targetSum {
    static int targtSm(int []arr,int sum){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={4,6,3,5,8,2};
        System.out.println("Number of pairs having  the given sum are :"+targtSm(arr,7));
    }
}
