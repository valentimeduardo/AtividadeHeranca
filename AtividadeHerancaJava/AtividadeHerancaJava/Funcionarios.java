public class Funcionarios{
    protected String Nome;
    protected int Idade;
    protected String Funcao;

    public Funcionarios(String Nome, int Idade, String Funcao){
        this.Nome = Nome;
        this.Idade = Idade;
        this.Funcao = Funcao;
    }
    
    public void exibirinformacoes(){
        System.out.println("Nome:" + Nome);
        System.out.println("Idade:" + Idade);
        System.out.println("Funcao:" + Funcao);
    }
}
