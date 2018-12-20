package yo;
import java.util.Scanner;

public class EvensRangePrinter {
    public static void main(String[] args) {
        int first;
        int last;
        Scanner sc = new Scanner(System.in);
        System.out.println ("enter first");
        first = sc.nextInt();
        System.out.println ("enter last");
        last = sc.nextInt();
        if(last  > first) {
            for (int  x = first; x < last;x++) {
                x= x +1;
                System.out.print(x + " ");
            }
        }
        else if (first > last) {System.out.println ("      ");
            }
        }
    }

