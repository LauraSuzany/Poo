package polimorfismo;

public abstract class Animal {
//Parametros

    protected float peso;
    protected int idade;
    protected int membros;

//Metodos
    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();
}
