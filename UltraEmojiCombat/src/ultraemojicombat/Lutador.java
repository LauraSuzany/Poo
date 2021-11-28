package UltraEmojiCombat;

public class Lutador {

    //METODO CONSTRUTOR
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        //this.peso = pe;
        this.vitorias = vi;
        this.derrota = de;
        this.empate = em;
    }
    
    //ATRIBUTOS
    //interface seria os metodos
private String nome;
private String nacionalidade;
private int idade;
private double altura;
private double peso;
private String Categoria;
private int vitorias;
private int derrota;
private int empate;
                
    //METODOS
public void apresentar(){
    System.out.println("========================================================");
    System.out.println("CHAGOU A HORA!!! apresentamos o Lutador: "+this.getNome());   
    System.out.println("Diretamente de : "+this.getNacionalidade());   
    System.out.println("Com : "+this.getIdade()+" anos e "+this.getAltura()+"cm de altura");      
    System.out.println("Pesando: "+this.getPeso()+"Kg");
    System.out.println("Ganhou: "+ this.getVitorias()+" veze");   
    System.out.println("Perdeu: "+this.getDerrota()+" veze");   
    System.out.println("Empatou: "+this.getEmpate()+" veze");
}
public void status (){
    System.out.println(this.getNome());
    System.out.println("Categoria: "+this.getCategoria());
    System.out.println("Derrotas: "+this.getDerrota());
    System.out.println("Vitórias: "+this.getVitorias());
    System.out.println("Empate: "+this.getEmpate());

}
public void ganharLuta(){
    setVitorias(getVitorias()+1);
}
public void perderLuta(){
    setDerrota(getDerrota()+1);
}
public void empatarLuta(){
    setEmpate(getEmpate()+1);
}
//get

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    public String getCategoria() {
        return Categoria;
    }
    private int getVitorias() {
        return vitorias;
    }

    public int getDerrota() {
        return derrota;
    }

    public int getEmpate() {
        return empate;
    }
//set

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();// 
    }
    public void setCategoria(){
        if(peso<52.2){
            Categoria = "Inválido";
        }else if (peso <= 70.3){
        Categoria = "Leve";
    }else if (peso <= 83.9){
        Categoria ="Médio"; 
    }else if (peso <= 120.2){
        Categoria = "Pesado"; 
    }else{
            System.out.println("Inválido");
    }
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public void setDerrota(int de) {
        this.derrota = de;
    }

    public void setEmpate(int em) {
        this.empate = em;
    }
    

        
}