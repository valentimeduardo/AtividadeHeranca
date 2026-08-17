class Revista extends Publicacao{
    constructor(AnoDePublicacao, Assunto, Maquiagem){
        super(AnoDePublicacao, Assunto);
        this.Maquiagem = Maquiagem
    }

    exibirInformacoes(){
        return`
        AnoDePublicacao:${this.AnoDePublicacao}
        Assunto:${this.Assunto}
        Noticia:${this.Noticia}
        `;

    }
}

const revista1 = new Revista(
    "2026",
    "Moda",
    "Corretivo",

)