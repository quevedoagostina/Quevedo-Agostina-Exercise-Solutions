package JAVA4;
import java.util.Scanner;
import documents.Document;
import documents.InVoice;
import documents.Order;
import documents.UrgentOrder;
import documents.HumanResources.documents.CV;
import documents.HumanResources.documents.Contract;

public class JAVA4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select a document type: 1-Invoice, 2-Order, 3-Urgent Order, 4-Contract, 5-CV");
            int choice = scanner.nextInt();
            Document document = null;

            switch (choice) {
                case 1:
                    document = new InVoice("INV001", 100.0);
                    break;
                case 2:
                    document = new Order("ORD001", 5);
                    break;
                case 3:
                    document = new UrgentOrder("UORD001", 3);
                    break;
                case 4:
                    document = new Contract("Contract John Doe", "Contract", "CON001", "John Doe", "12/03/2023", "12/03/2025");
                    break;
                case 5:
                    document = new CV("CV- John Doe", "CV", "John Doe", "123 Main St", "johndoe@mail.com", "High School", "Unemployed");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            if (document != null) {
                document.display();
            }
        }
    }
}
