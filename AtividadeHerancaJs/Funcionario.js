class Funcionario{
    constructor(nome, idade, cargo){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }

    mostrarDados(){
        alert(
            "Nome:" + this.nome +
            "n\ Idade" + this.idade +
            "n\ Cargo" + this.cargo

        );
    }
   
}