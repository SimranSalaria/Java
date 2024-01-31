import java.util.Scanner;

public class sort012Arr {
    static void sortArr012(int arr[]){

        int numZeroes=0;
        int numOnes=0;
        int numTwos=0;
        int counter=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                numZeroes++;
            }
            if(arr[i]==1){
                numOnes++;
            }
            if(arr[i]==0){
                numTwos++;
            }
        }
        for(int i=0;i<numZeroes;i++){//counter variable keep record of the current index where next element should place
           arr[counter++]=0;
        }
        for(int i=0;i<numOnes;i++){
            arr[counter++]=1;
        }
        for(int i=0;i<numTwos;i++){
            arr[counter++]=2;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of the elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter elements of the array:");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
            sortArr012(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

