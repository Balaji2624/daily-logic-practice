// Write a program to Check if an Array is Sorted or NOT.

package date20_04;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 18, 30};
        boolean sorted = true;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }
        
        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}

