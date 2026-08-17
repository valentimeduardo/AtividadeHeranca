public class Professor extends Pessoa{
    private String Disciplina;
    private String Ensinar;

    public Professor(String Nome, int Idade, String Disciplina, String Ensinar){
        super(Nome, Idade);
        this.Disciplina = Disciplina;
        this.Ensinar = Ensinar;
    }
    @Override
    public void estudar(){
        System.out.println("====ALUNO====");
        System.out.println("Nome:" + Nome);
        System.out.println("Idade:" + Idade);
        System.out.println("Disciplina:" + Disciplina);
        System.out.println("Ensinar:" + Ensinar);
    }
}
