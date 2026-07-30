import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter the size of first array: ");
        int m = sc.nextInt();

        int[] arr1 = new int[m];

        // Input elements of first array
        System.out.println("Enter the elements of first sorted array:");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter the size of second array: ");
        int n = sc.nextInt();

        int[] arr2 = new int[n];

        // Input elements of second array
        System.out.println("Enter the elements of second sorted array:");
        for (int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
        }

        // Create merged array
        int[] merged = new int[m + n];

        // Initialize pointers
        int i = 0, j = 0, k = 0;

        // Merge the arrays
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                i++;
                k++;
            } else {
                merged[k] = arr2[j];
                j++;
                k++;
            }
        }

        // Copy remaining elements of first array
        while (i < m) {
            merged[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of second array
        while (j < n) {
            merged[k] = arr2[j];
            j++;
            k++;
        }

        // Print merged array
        System.out.println("Merged Array:");
        for (k = 0; k < merged.length; k++) {
            System.out.print(merged[k] + " ");
        }

        sc.close();
    }
}
