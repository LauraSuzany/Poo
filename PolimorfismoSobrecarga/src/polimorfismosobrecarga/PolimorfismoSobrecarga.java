package polimorfismosobrecarga;

public class PolimorfismoSobrecarga {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
//        m.emitirSom();
//        l.emitirSom();
//        c.emitirSom();
c.reagir("Olá");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(true);
        c.reagir(false);
    }
    
}
