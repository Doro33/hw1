import java.util.Scanner;

public class TakeHomePay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the employee's salary: ");
        float salary = scanner.nextInt();
        // take home pay = salary - tax;
        float takeHomePay;
        if(salary < 3000000)
            takeHomePay= salary * 95 / 100 ;
        else if(salary<=6000000)
            takeHomePay= salary * 90 / 100 ;
        else
            takeHomePay = salary * 76 / 100 ;

        System.out.println("Employee's take home pay is: " + takeHomePay);
    }
}
