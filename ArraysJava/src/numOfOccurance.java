public class numOfOccurance {
    static void printArray(int []arr){
        System.out.println("Given array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void numOccu(int x,int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println("The element " +x +" is found "+ count+" times in the array");
    }
    public static void main(String[] args) {
        int []arr={2,4,6,8,2,9,5,1,2};
        printArray(arr);
        numOccu(8,arr);

    }
}