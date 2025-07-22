public static void buildings(int[] arr, int n) {
    int mx = Integer.MIN_VALUE;
    
    // Find the maximum height
    for (int val : arr) {
        if (val > mx) {
            mx = val;
        }
    }

    // Print the building pattern
    for (int i = mx; i >= 1; i--) {
        for (int idx = 0; idx < n; idx++) {
            if (arr[idx] >= i) {
                System.out.print("*\t");
            } else {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
}
