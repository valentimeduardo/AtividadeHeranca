public class Pessoa{
    protected String Nome;
    protected int Idade;
    
    public Pessoa(String Nome, int Idade){
        this.Nome = Nome;
        this.Idade = Idade;
    }
    public void estudar(){
        System.out.println("Nome:" + Nome);
        System.out.println("Idade:" + Idade);
    }
}

