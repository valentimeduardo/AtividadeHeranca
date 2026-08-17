public class Biblioteca{
    private String Publico;
    private String Livro;
    private String Revista;

    public Biblioteca(String Publico , String Livro, String Revista){
        this.Publico = Publico;
        this.Livro = Livro;
        this.Revista = Revista;
    }
    public void exibirinformaçoes(){
        System.out.println("Publico:" + Publico);
        System.out.println("Livro:" + Livro);
        System.out.println("Revista:" + Revista);
    }
}