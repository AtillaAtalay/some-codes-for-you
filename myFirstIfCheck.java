import java.util.Scanner;

public class myFirstIfCheck{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double area = 0;
        if (shape.equals("square")){
            double squareSide = Double.parseDouble(scanner.nextLine());
            area = squareSide * squareSide;
            System.out.println();
            System.out.printf("%.3f",area);
        }else if (shape.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;
            System.out.printf("%.3f",area);
        }else if (shape.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
            System.out.printf("%.3f",area);
        }else if (shape.equals("triangle")){
            double triangleSide = Double.parseDouble(scanner.nextLine());
            double triangleHight = Double.parseDouble(scanner.nextLine());
            area = (triangleHight * triangleSide) / 2;
            System.out.printf("%.3f",area);
        }
    }
}