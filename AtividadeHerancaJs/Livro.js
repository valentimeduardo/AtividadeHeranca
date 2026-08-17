class Livro extends Publicacao{
    constructor(AnoDePublicacao, Assunto, QuantidadeDePaginas){
        super(AnoDePublicacao, Assunto);
        this.QuantidadeDePaginas = QuantidadeDePaginas;
    }

    exibirInformacoes(){
        return`
        AnoDePublicacao:${this.AnoDePublicacao}
        Assunto:${this.Assunto}
        QuantidadeDePaginas:${this.QuantidadeDePaginas}
        `;

    }
}

const livro1 = new Livro(
    "1989",
    "Fantasia",
    381
)