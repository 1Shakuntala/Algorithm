import java.util.*;

public class Main {
  static int[] calSum(int a[], int b[], int n, int m) {
    // your code here
    int[] ans = new int[Math.max(n,m)];
    int i=n-1;
    int j=m-1;
    int k=ans.length-1;

    int carry=0;

    while(k>=0){
      int digit = carry;
      if(i>=0){
        digit = digit + a[i];
      }
      if(j>=0){
        digit = digit + b[j];
      }
      ans[k]=digit%10;
      carry=digit/10;
      i--;
      j--;
      k--;
    }
    if(carry==0) return ans;
    else{
      int[] res = new int[ans.length+1];
      res[0]=carry;
      for(int idx=0;idx<ans.length; idx++){
        res[idx+1] = ans[idx];
      }
      return res;
    }
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}

Input:
3
1 2 3
3
3 2 1

Output
4
4
4
