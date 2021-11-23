package polimorfismo;
//Todos os mamiferos irão herdar os parametros e os métodos da classe abstrata animal e 
//todos os animais que forem instaciados iram herdar parametros e metodos da classe animal 
public class Mamiferos extends Animal {

    private String corPelo;

    //Todo metodo herdado de uma classe abstrata tem que ser sobreescrito/ lembrando que a classe abstrata serve apenas como classe 
    //que vai ser herdada ou seja não podem ser feitos programas(funções) nela e nem instanciar objetos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

}
