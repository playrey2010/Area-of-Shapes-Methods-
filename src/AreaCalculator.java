import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = "";
        double segment1 = 0, segment2;

        System.out.print("Choose the shape whose area I shall calculate(circle, triangle, rectangle or square) : ");
        shape = sc.nextLine();
        if (shape.equalsIgnoreCase("circle")) {
            System.out.print("Input the radius: ");
            segment1 = sc.nextDouble();
            showCircleArea(segment1);
        } else if (shape.equalsIgnoreCase("triangle")) {
            System.out.print("Input the base: ");
            segment1 = sc.nextDouble();
            System.out.print("Input the height: ");
            segment2 = sc.nextDouble();
            showTriangleArea(segment1, segment2);
        } else if (shape.equalsIgnoreCase("rectangle")) {
            System.out.print("Input the length: ");
            segment1 = sc.nextDouble();
            System.out.print("Input the width: ");
            segment2 = sc.nextDouble();
            showRectangleArea(segment1, segment2);
        } else if (shape.equalsIgnoreCase("square")) {
            System.out.print("Input side length: ");
            segment1 = sc.nextDouble();
            showSquareArea(segment1);
        }
    }


    public static void showCircleArea(double radius) {
        double pi = 3.14;
        System.out.println(pi * (Math.pow(radius, 2)));
    }

    public static void showTriangleArea(double base, double height) {
        System.out.println((base*height)/2);
    }

    public static void showRectangleArea(double length, double width) {
        System.out.println(length * width);
    }

    public static void showSquareArea(double side) {
        System.out.println(Math.pow(side, 2));
    }

}
