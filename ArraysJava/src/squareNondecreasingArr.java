//non decreasing =1 2 2 4(not increasing)
public class squareNondecreasingArr {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }
    static int[] square(int arr[]){
        int n=arr.length;
        int left=0;
        int right =n-1;
        int ans[]=new int[n];
        int j=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[j++]=arr[left]*arr[left];
                left++;
            }else{
                ans[j++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-10,-5,-4,1,2,9};
        int []x=square(arr);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
        reverse(x);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }


    }
}
