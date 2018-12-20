package yo;
import java.util.Scanner;


public class CharsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println ("enter phrase");
        s = sc.nextLine();
        int count = 0;
        char [] symb = s.toCharArray();
        for(int i = 0; i < symb.length;i++)
            if(symb[i] == 'o')
                ++count;
        System.out.println(count);

        }
}
