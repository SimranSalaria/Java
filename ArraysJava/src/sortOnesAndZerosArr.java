public class sortOnesAndZerosArr {
    static void sortedOnesZeroes(int arr[]) {
        int n = arr.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                counter++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < counter) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
        public static void main (String[]args){
            int arr[] = {0, 1, 0, 1, 0, 1, 1, 0, 0};
            System.out.print("Original Array : ");
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            sortedOnesZeroes(arr);
            System.out.println("Sorted Array : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }