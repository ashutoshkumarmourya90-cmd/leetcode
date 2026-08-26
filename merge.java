lass Solution {
    
     public void merge(int[] nums1, int m, int[] nums2, int n) {
    // Pointer for the last valid element in nums1
    int p1 = m - 1;
    // Pointer for the last element in nums2
    int p2 = n - 1;
    // Pointer for the last position in nums1
    int p = m + n - 1;

    // While there are still elements to merge in nums2
    while (p2 >= 0) {
        // If nums1 has elements left and the current nums1 element is larger
        if (p1 >= 0 && nums1[p1] > nums2[p2]) {
            nums1[p--] = nums1[p1--];
        } else {
            // Otherwise, take from nums2
            nums1[p--] = nums2[p2--];
        }
    }
}
     
}
