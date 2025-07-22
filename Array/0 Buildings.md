



Public static void buildings(int[] arr, int n) {
    int mx = Integer.MIN_VALUE;
    
    
    for (int val : arr) {
        if (val > mx) {
            mx = val;
        }
    }


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
