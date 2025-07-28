import java.io.*;
import java.util.*;

public class Main {
	static int isPalindrome(String str)
      {
              //write code here
              str = str.toLowerCase();
              int st=0;
              int end=str.length()-1;
              while(st<end){
                char sch =  str.charAt(st);
                char ech =  str.charAt(end);
                if(sch<'a' || sch>'z'){
                    st++;
                    continue;
                }
                if(ech<'a' || ech>'z'){
                    end--;
                    continue;
                }
                if(sch!=ech){
                    return 0;
                }
                else{
                    st++;
                    end--;
                }

              }
              return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }
}
