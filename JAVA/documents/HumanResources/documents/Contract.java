package documents.HumanResources.documents;
import documents.Document;

public class Contract extends Document {
    private String contractNumber;
    private String employeeName;
    private String startDate;
    private String endDate;

    public Contract(String title, String content, String contractNumber, String employeeName, String startDate, String endDate) {
        super(title, content); 
        this.contractNumber = contractNumber;
        this.employeeName = employeeName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void display() {
        System.out.println("Número de Contrato: " + contractNumber);
        System.out.println("Nombre del Empleado: " + employeeName);
        System.out.println("Fecha de Inicio: " + startDate);
        System.out.println("Fecha de Finalización: " + endDate);
    }
}
