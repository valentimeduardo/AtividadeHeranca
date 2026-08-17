class Publicacao{
    constructor(AnoDePublicacao, Assunto){
        this.AnoDePublicacao = AnoDePublicacao;
        this.Assunto = Assunto;
    }

    exibirInformacoes(){
        return`
        AnoDePublicacao:${this.AnoDePublicacao}
        Assunto:${this.Assunto}
        `;

    }

}