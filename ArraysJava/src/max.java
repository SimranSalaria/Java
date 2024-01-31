public class max {
    public static void main(String[] args) {

    int []arr={2,8,4,9,6,98};
    int x= Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>x){
            x=arr[i];
        }
    }
        System.out.println("Max element of array = "+x);
    }

}
