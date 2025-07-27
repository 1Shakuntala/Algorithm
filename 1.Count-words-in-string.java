import java.io.*;
import java.lang.*;
import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String p = sc.nextLine();
    while (t > 0) {
      String s = sc.nextLine();
      System.out.println(countWords(s));
      t--;
    }
  }

  public static int countWords(String s) {
    // your code here
    int cnt=0;
    int itr=0;
    int n = s.length();
    while(itr<n){
      while(itr<n && s.charAt(itr)==' '){
        itr++;
      }
      if(itr<n){
        cnt++;
      }
      while(itr<n && s.charAt(itr)!=' '){
        itr++;
      }
    }
    return cnt;
  }
}
