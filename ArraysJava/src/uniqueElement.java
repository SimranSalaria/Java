import java.util.Scanner;

public class uniqueElement {
    static int unique_No(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }
        int x=-1;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
               x=arr[i];
           }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of elements");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter elements of the array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Unique number in the array is : "+unique_No(arr));
    }
}
