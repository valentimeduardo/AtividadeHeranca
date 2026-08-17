class Professor extends Pessoa{
    constructor(nome, idade, disciplina){
        super(nome, idade);
        this.disciplina=disciplina;
    }

    ensinar(){
        return`
        Nome:${this.nome}
        Idade:${this.idade}
        Disciplina:${this.disciplina}
        `;
    }
}

const pessoa2 = new Pessoa(
    "Tiago",
    32
)

const professor1 = new Professor(
    "Tiago",
    32,
    "Matemática"
)