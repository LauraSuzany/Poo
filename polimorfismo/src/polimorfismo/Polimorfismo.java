package polimorfismo;

public class Polimorfismo {
//Mesmo metodo mesmo nome com formas de respostas diferentes, ou seja, ajustando ao conceito de 
//polimorfismo tenho fazer uma coisa com o mesmo nome e essa coisa agir de formas diferentes

//polimorfismo de sobreposição: Acontece quando substituimos um metodo de uma superclasse na sua subclasse, usando a mesma assinatura 
    public static void main(String[] args) {
        //Instaniando objetos
        Mamiferos m1 = new Mamiferos();
        Repetil r1 = new Repetil();
        Ave a = new Ave();
        Peixe p1 = new Peixe();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara a1 = new Arara();

        System.out.println("***** Mamifero *****");
        m1.setPeso(85.3f);
        m1.setIdade(2);
        m1.setMembros(4);
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        System.out.println("***** Réptil *****");
        r1.setPeso(0.5f);
        r1.setIdade(1);
        r1.setMembros(0);
        r1.locomover();
        r1.alimentar();
        r1.emitirSom();
        System.out.println("***** Ave *****");
        a.setPeso(0);
        a.setIdade(0);
        a.setMembros(0);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("***** Peixe *****");
        p1.setPeso(0.5f);
        p1.setIdade(1);
        p1.setMembros(0);
        p1.locomover();
        p1.alimentar();
        p1.emitirSom();
        p1.soltarBolha();
        System.out.println("***** Canguru *****");
        c.setPeso(55.8f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.emitirSom();
        c.alimentar();
        c.usarBolsa();
        System.out.println("***** Cachorro *****");
        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.emitirSom();
        k.alimentar();
        k.enterrarOsso();
        System.out.println("***** cobra *****");
        j.setPeso(0.5f);
        j.setIdade(1);
        j.setMembros(0);
        j.locomover();
        j.emitirSom();
        j.alimentar();
        System.out.println("***** GoldFish *****");
        g.setPeso(3.94f);
        g.setIdade(5);
        g.setMembros(6);
        g.locomover();
        g.emitirSom();
        g.alimentar();
        System.out.println("***** Arara *****");
        a1.setPeso(0.54f);
        a1.setIdade(20);
        a1.setMembros(0);
        a1.locomover();
        a1.emitirSom();
        a1.alimentar();
        
//        Mamiferos m = new Mamiferos();
//
//        System.out.println("***** Mamifero *****");
//        m.setPeso(5.70f);
//        m.setCorPelo("Marrom");
//        System.out.println(m.getCorPelo());
//        m.setIdade(8);
//        m.setMembros(4);
//        m.locomover();
//        m.alimentar();
//        m.emitirSom();
        System.out.println("Animais em movimento");
        k.locomover();
        c.locomover();
        a1.locomover();
    }

}
