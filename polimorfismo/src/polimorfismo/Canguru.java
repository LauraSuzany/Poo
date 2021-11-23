package polimorfismo;

public class Canguru extends Mamiferos {

    public void usarBolsa() {
        System.out.println("Usar Bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
}
