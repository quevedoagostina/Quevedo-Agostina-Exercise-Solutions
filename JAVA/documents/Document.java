package documents;

public class Document {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public Document() {
        this.title = "Default Title";
        this.content = "Default Content";
    }

    public void display() {
        System.out.println("Título: " + title);
        System.out.println("Contenido: " + content);
    }
}
