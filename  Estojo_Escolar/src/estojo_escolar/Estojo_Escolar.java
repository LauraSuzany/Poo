package estojo_escolar;

public class Estojo_Escolar {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("FabCastel", "vermelha", 0.4f);
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        System.out.println(c1.toString());

        // System.out.println("Tenho uma caneta "+ c1.getModelo()+ "de ponta "+ c1.getPonta());
    }
}
