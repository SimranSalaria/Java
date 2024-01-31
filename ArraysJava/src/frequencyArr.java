
import java.util.Scanner;

//to check if given number is present in array or not ....queries....value of element in array is less 10^5
public class frequencyArr {
    static int[] makeFrequencyArr(int arr[]) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={5,6,5,400,560,1000,400};
        int[]arr1={78,9000,34,67,1234,8970};
        int freq[]=makeFrequencyArr(arr1);
        int q=5;
        while(q>0){
            System.out.println("enter number to be search in array");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

            q--;
        }
    }
}
