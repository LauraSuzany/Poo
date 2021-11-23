package polimorfismo;

public class Cachorro extends Mamiferos {

    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void abanarRabo() {

    }
    @Override
    public void emitirSom(){
        System.out.println("AU! AU! AU!");  
    }
}
