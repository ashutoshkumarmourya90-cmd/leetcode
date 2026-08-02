class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int i = 0, j = 0, k = 0;

        // Merge the two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy remaining elements of nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Copy remaining elements of nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        int total = m + n;

        // If total number of elements is odd
        if (total % 2 == 1) {
            return merged[total / 2];
        }

        // If total number of elements is even
        return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
    }
}
