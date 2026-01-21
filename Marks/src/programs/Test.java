package programs;

public class Test {

    public static void duplicateZeros(int[] arr) {
        int dup = 0;
        int length = arr.length - 1;

        // Count the number of zeros to be duplicated
        for (int left = 0; left <= length - dup; left++) {
            if (arr[left] == 0) {
                if (left == length - dup) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                dup++;
            }
        }

        int last = length - dup;

        // Start backwards and duplicate zeros
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + dup] = 0;
                dup--;
                arr[i + dup] = 0;
            } else {
                arr[i + dup] = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0,8,0,0,0,9,0};
        duplicateZeros(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}