package codeFest;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    public void display() {
        System.out.println("Width: " + width + " Height: " + height);
    }
}

class RectangleArea extends Rectangle {
    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        width = scanner.nextInt();
        height = scanner.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Area: " + (width * height));
    }
}

public class Codeathon05_Harish_B{
    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.readInput();
        rectangle.display();
    }
}
