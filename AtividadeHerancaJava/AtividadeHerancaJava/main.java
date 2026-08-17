public class main{
    public static void main (String[]args){
        Aluno aluno = new Aluno(
            "Hellen",
            18,
            "Desenvolvimento Sistema",
            "Informatica"
        );
        Aluno[]acervo = {aluno};
        for (Aluno aluno1: acervo){
            aluno1.estudar();
            System.out.println("-------------");
        }
        Professor professor = new Professor(
            "Gisele",
            25,
            "Mobile",
            "Focada"
        );
        Professor[]acervo1 = {professor};
        for (Professor professor1: acervo1){
            professor1.estudar();
            System.out.println("--------------");
        }
        Biblioteca biblioteca = new Biblioteca(
            "Infantil",
            "O Rato Roeu",
            "Infantil"
        );
        Biblioteca[]acervo2 = {biblioteca};
        for (Biblioteca biblioteca1: acervo2){
            biblioteca1.exibirinformaçoes();
            System.out.println("--------------");
        }
        Veiculos veiculos = new Veiculos(
            "Corolla",
            "Toyota",
            2026
        );
        Veiculos[]acervo3 = {veiculos};
        for (Veiculos veiculos1: acervo3){
            veiculos1.exibirinformacoes();
            System.out.println("-------------");
        }
        Funcionarios funcionarios = new Funcionarios(
            "Ana",
            18,
            "Auxiliar Administrativo"
        );
        Funcionarios[]acervo4 = {funcionarios};
        for (Funcionarios funcionarios1: acervo4){
            funcionarios1.exibirinformacoes();
            System.out.println("------------");
        }
        Gerente gerente = new Gerente(
            "Maria",
            30,
            "Encarregado",
            "Administrativo"
        );
        Gerente[]acervo5 = {gerente};
        for (Gerente gerente1: acervo5){
            gerente1.exibirinformacoes();
            System.out.println("-----------");
        }
        Corrente corrente = new Corrente(
            12346,
            123,
            50000,
            10000
        );
        Corrente[]acervo6 = {corrente};
        for (Corrente corrente1: acervo6){
            corrente1.exibirinformacoes();
            System.out.println("---------------");
        }
        Poupanca poupanca = new Poupanca(
            56789,
            456,
            10000,
            200000
        );
        Poupanca[]acervo7 = {poupanca};
        for (Poupanca poupanca1: acervo7){
            poupanca1.exibirinformacoes();
            System.out.println("--------------");
        }


    }
}
