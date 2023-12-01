package application;

import java.util.Scanner;
import entities.Triangle;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions for Triangle x:");
        double xSide1 = sc.nextDouble();
        double xSide2 = sc.nextDouble();
        double xSide3 = sc.nextDouble();

        System.out.println("Enter the dimensions for Triangle y:");
        double ySide1 = sc.nextDouble();
        double ySide2 = sc.nextDouble();
        double ySide3 = sc.nextDouble();

        // Criar objetos Triangle com os dados fornecidos pelo usuário
        Triangle x = new Triangle(xSide1, xSide2, xSide3);
        Triangle y = new Triangle(ySide1, ySide2, ySide3);
        Double areaX = x.area();
        Double areaY = y.area();
        System.out.printf("Triangle x area is: %.2f%n", areaX);
        System.out.printf("Triangle y area is: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area x");
        } else {
            System.out.println("Large area y");
        }
        sc.close();
    }
}