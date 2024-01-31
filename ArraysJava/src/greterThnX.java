//count the number of elements greater than x
public class greterThnX {
    static int greater_X(int []a,int x){
        int count =0;
        for(int i=0;i<a.length;i++){
            if(a[i]>x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,2,8,9,5,6,2,9,10,47,87};
        System.out.println(" Number of greater elements are = "+greater_X(arr,3));
    }
}
