import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the base of triangle: ");
        int baseOfTriangle = scanner.nextInt();
        System.out.println("Your triangle is ready ;) ");
        for (int rowIndex = 1 ; rowIndex <= baseOfTriangle ; rowIndex++) {
            // this part of code was wrote to make enough spaces at first of the rows.
            // no means number of.
            for (int noSpaces = baseOfTriangle - rowIndex ; 0 < noSpaces ; noSpaces--) {
                System.out.print(" ");
            }
            // this part of code was wrote to print enough * in each row.
            // no means number of.
            for (int noStars = 1 ; noStars <= rowIndex ; noStars++) {
                System.out.print("* ");
            }
            // this part bring us to the next row.
            System.out.println();
        }
    }
}
