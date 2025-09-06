package Study.java005TriangleMath;

import java.util.Scanner;

public class java005TriangleMath {

    public static void main(String[] args){

        // Triangle Hypotenuse 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter side b: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt((a * a) + (b * b));

        System.out.println(c);

        scanner.close();
    }
}