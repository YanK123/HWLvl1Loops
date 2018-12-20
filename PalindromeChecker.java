package yo;
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println ("input word");
        s = sc.nextLine();
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        String l = buffer.toString();
      boolean k = s.equals(l);
      System.out.println (k);


    }
}
