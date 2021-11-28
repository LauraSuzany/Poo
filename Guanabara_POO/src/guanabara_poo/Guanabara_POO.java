package guanabara_poo;

public class Guanabara_POO {

    public static void main(String[] args) {
        // Visitante v1 = new Visitante();
        //v1.setNome("Juvenal");
        // v1.setIdade(22);
        //v1.setSexo("M");
        //System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setCurso("Informatica");
        a1.setMatrincula(1111);
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println("--------------------------");

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setCurso("Ciência da computação");
        b1.setMatrincula(1122);
        b1.setIdade(18);
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        System.out.println("--------------------------");

        Professor p1 = new Professor();
        p1.setNome("Demys Brito");
        p1.setEspecialidade("Mestre");
        p1.setIdade(45);
        p1.setSexo("M");
        p1.setSalario(4090f);
        p1.receberAumento();
        System.out.println(p1.toString());
        System.out.println("--------------------------");
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Laura Suzany");
        t1.setEspecialidade("Markting Digital");
        t1.setIdade(22);
        t1.setSexo("F");
        t1.setSalario(100000.00f);
        t1.setRegistroProfissional(668235410);
        System.out.println(t1.toString()+",Registro Profissional="+t1.getRegistroProfissional() );
        System.out.println("--------------------------");
        
        
        
    }

}
