package documents;

public class InVoice extends Document {
    private String invoiceNumber;
    private double amount;

    public InVoice(String invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }
    
    public void display() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Amount: $" + amount);
    }
}

