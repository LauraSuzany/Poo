package guanabara_poo;

public class Professor extends Pessoa {
    //Atributos

    private String especialidade;
    private float salario;

//Metodo especial
    public void receberAumento() {
        System.out.println(this.getNome() + " recebendo aumento");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "Nome=" + this.getNome() + ", especialidade=" + especialidade + ", Idade=" + this.getIdade() + ", sexo=" + this.getSexo() + ", salario=" + salario + '}';
    }

}
