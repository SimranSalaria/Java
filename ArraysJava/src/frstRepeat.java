//to find first repeating element in the array if not repeating than return -1
public class frstRepeat {
    static int firstRp(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,6,8,2,};
        System.out.println(firstRp(arr));

    }
}
