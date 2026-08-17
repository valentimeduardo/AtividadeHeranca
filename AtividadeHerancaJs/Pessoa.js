class Pessoa{
    constructor(nome, idade){
        this.nome=nome;
        this.idade=idade;
    }

    imprimirDetalhes(){
        return`
        Nome:${this.nome}
        Idade:${this.idade}
        `;
    }
}