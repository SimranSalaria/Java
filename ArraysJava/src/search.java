public class search {
    public static void search(int arr[]) {
        int x = 3;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println(" Not found");
        } else {
            System.out.println("Found " + x + " at index " + ans);
        }
    }
    public static void main(String[] args) {
        int []arr={1,5,3,8,9,3};
        search(arr);
    }
}
