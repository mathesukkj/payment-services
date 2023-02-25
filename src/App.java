import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the contract data: ");
        System.out.print("Number: ");
        int contractNumber = s.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(s.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Contract price: ");
        double contractPrice = s.nextDouble();
        System.out.print("Enter the number of installments: ");
        int contractInstallments = s.nextInt();

        s.close();
    }
}
