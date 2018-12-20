package yo;
import java.util.Scanner;

public class RandomsPrinter {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter count: ");
            int count = sc.nextInt();
            System.out.print("Enter min: ");
            int min = sc.nextInt();
            System.out.print("Enter max: ");
            int max = sc.nextInt();
            if (count < 0 || min >= max) {
                System.out.println("error");
                System.exit(-1);
            }
            for (int x = 1; x <= count; x++) {
                int random = min + (int) (Math.random() * ((max - min) + 1));
                System.out.println(random);
            }
        }
    }

