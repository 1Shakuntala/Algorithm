import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void revA(int[] nums, int i, int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotateArray(int[] nums, int k) {
           // write your code here
           int n = nums.length;
           if(k>=n) k = k%n;
           if(k<0)  k = k+n;
           revA(nums, 0, n-k-1);
           revA(nums, n-k, n-1);
           revA(nums, 0, n-1);
        //    for(int val: nums){
        //         System.out.print(val+" ");
        //    }
           
    }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        rotateArray(arr, k);
        
        for(int num : arr){
            System.out.print(num + " "); 
        }
        
        scanner.close();
    }
}

Input:
8
7 5 2 11 2 43 1 1
2
Output:
1 1 7 5 2 11 2 43 
