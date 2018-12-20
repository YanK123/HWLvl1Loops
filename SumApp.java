package yo;
import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i > 0; i++) {
            System.out.println("Enter the number: ");
            int s = sc.nextInt();
            if (s != 0) {
                sum = sum + s;
            } else {
                System.out.println(sum + s);
                break;
            }
        }
    }
}

