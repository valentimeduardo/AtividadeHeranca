public class Aluno extends Pessoa{
    private String Curso;
    private String Estudo;

    public Aluno(String Nome, int Idade, String Curso, String Estudo){
        super(Nome, Idade);
        this.Curso = Curso;
        this.Estudo = Estudo;
    }
    @Override
    public void estudar(){
        System.out.println("====ALUNO====");
        System.out.println("Nome:" + Nome);
        System.out.println("Idade:" + Idade);
        System.out.println("Curso:" + Curso);
        System.out.println("Estudo:" + Estudo);
    }
}