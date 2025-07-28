import java.util.*;

public class Main {
	static void SubString(String str) {
        //Write code here
        int n = str.length();
        for (int i = 0; i < n; i++) {
            String temp = "";
            for (int j = i; j < n; j++) {
                temp = temp + str.charAt(j); 
                System.out.println(temp);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubString(str);
    }
}
