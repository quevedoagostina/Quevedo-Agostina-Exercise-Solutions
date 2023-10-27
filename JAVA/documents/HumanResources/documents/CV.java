package documents.HumanResources.documents;
import documents.Document;

public class CV extends Document {
    private String name;
    private String address;
    private String email;
    private String education;
    private String experience;

    public CV(String title, String content, String name, String address, String email, String education, String experience) {
        super(title, content); 
        this.name = name;
        this.address = address;
        this.email = email;
        this.education = education;
        this.experience = experience;
    }

    public void display() {
        System.out.println("Nombre: " + name);
        System.out.println("Dirección: " + address);
        System.out.println("Correo Electrónico: " + email);
        System.out.println("Educación: " + education);
        System.out.println("Experiencia Laboral: " + experience);
    }
    

    // Otros métodos y campos específicos de CV
}
