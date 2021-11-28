package guanabara_poo;

public class Bolsista extends Aluno {

    private float Bolsa;

    public void RenovarBolsa() {
        System.out.println("Renovando Bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista pagamento facilitado");
    }

    public float getBolsa() {
        return Bolsa;
    }

    public void setBolsa(float Bolsa) {
        this.Bolsa = Bolsa;
    }

    //Posso definir como classe e metodos especiais como final, com a palavra final as classes com ele não´pode ter filhos e os metodos especiais com final não podem ser sobreescritos @Ove....
    @Override
    public String toString() {
        return "Bolsista{" + "Nome=" + this.getNome() + ", Curso=" + this.getCurso() + ", Matrincula=" + this.getMatrincula() + ", Idade=" + this.getIdade() + ", Sexo= " + this.getSexo() + ", Valor da Bolsa=" + this.getBolsa() + '}';
    }
}
