package yo;

import java.util.Scanner;

public class MultiplicationTablePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        if (size<0) {
            System.out.println("Error");
        }
        int sum =0;
        for (int i = 1; i <=size ; i++) {
            for (int j = 1; j <= size; j++) {
                sum = i * j;
                System.out.printf("%5d",sum);
            }
            System.out.println();
        }
    }
}
