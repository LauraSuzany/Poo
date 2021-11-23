package polimorfismosobrecarga;

public class PolimorfismoSobrecarga {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
    }
    
}
