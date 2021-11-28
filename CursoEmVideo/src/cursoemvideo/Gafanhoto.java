package cursoemvideo;

public class Gafanhoto extends Pessoa {
//Atributos

    private String login;
    private int totAssistido;

//Construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);//usando um super para pegar atributos da super classe
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm() {
        this.setTotAssistido(getTotAssistido() + 1);
    }

    @Override
    public void ganharExp() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExpereiencia() {
        return expereiencia;
    }

    public void setExpereiencia(int expereiencia) {
        this.expereiencia = expereiencia;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
        //  super.string() = vai chamar os dados de pessoas 
        //super é o  to string da classe que esta sendo estendida 
    }

}
