import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    buildings(arr, n);
  }

  public static void buildings(int[] arr, int n) {
    // your code here
    int mx = Integer.MIN_VALUE;
    for(int val: arr){
      if(val>mx){
        mx=val;
      }
    }
    for(int i = mx; i>=1; i--){
      for(int idx=0; idx<n; idx++){
        if(arr[idx]>= i ){
          System.out.print("*\t");
        }else{
          System.out.print("\t");
        }
      }
      System.out.println();
    }
    
  }
}

Input
7
9 3 7 6 2 0 4
Output
*
*
*               *
*               *       *
*               *       *
*               *       *                       *
*       *       *       *                       *
*       *       *       *       *               *
*       *       *       *       *               *
