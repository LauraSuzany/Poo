package guanabara_poo;

public class Aluno extends Pessoa{
//Atributos
    private String curso ;
    private int Matrincula;
//Metodos especiais
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno "+this.getNome());
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatrincula() {
        return Matrincula;
    }

    public void setMatrincula(int Matrincula) {
        this.Matrincula = Matrincula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome=" + this.getNome() + ", Curso=" + curso + ", Matrincula=" + Matrincula + "Idade=" + this.getIdade() + "Sexo= " + this.getSexo() + '}';
    }

}
