package controle;

public class Controle {

    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();

        c1.ligar();
        c1.menosVolume();
        c1.ligarMudo();   
        c1.play();
        c1.pause();
        c1.abrirMenu();
        c1.fecharMenu();

    }
}
