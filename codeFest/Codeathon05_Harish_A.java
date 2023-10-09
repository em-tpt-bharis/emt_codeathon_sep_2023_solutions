package codeFest;

import java.util.Scanner;

public class Codeathon05_Harish_A {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        double var1 = scanner.nextInt();
        double var2 = scanner.nextInt();

        var1 = var1 + var2;
        var2 = var1 - var2;
        var1 = var1 - var2;

        scanner.close();

        var1 = (var1 / 100) * 10;
        var2 = (var2 / 100) * 20;


        System.out.printf("var1: %d%n", (int) var1);
        System.out.printf("var2: %d%n", (int) var2);

    }
}
