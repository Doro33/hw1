import java.util.Scanner;
public class ReversedNumber {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter the number:");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        System.out.print("The reversed number is: ");
       /*while(number%10==0) {
            System.out.print(0);
            number=number/10;
        }*/
        while (number!= 0){
            reversedNumber = reversedNumber*10 +(number%10);
            number = number/10;
        }
        System.out.println(reversedNumber);
    }
}
