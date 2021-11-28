package cursoemvideo;
//interface com metodos abstratos 

public abstract class Pessoa {

//Atributis
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int expereiencia;
//Construtir

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.expereiencia = 0;
    }

    public abstract void ganharExp();
//toString tudo que vai aparecer quando eu chamar pessoa atravez da classe garfanhoto na classe principal

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", expereiencia=" + expereiencia + '}';
    }

}
