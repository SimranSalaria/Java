//to find smallest and largest element in the array
import java.util.Arrays;

public class lar_small {
    static int[] larSmall(int arr[]){
         Arrays.sort(arr);

        int []x={arr[0],arr[arr.length-1]};
        return x;

    }
    public static void main(String[] args) {
        int arr[]={2,3,5,61,8,9};
        int ans[]=larSmall(arr);
        System.out.println("Smallest element in the array : " + ans[0]);
        System.out.println("Largest element in the array : "+ ans[1]);
    }
}
