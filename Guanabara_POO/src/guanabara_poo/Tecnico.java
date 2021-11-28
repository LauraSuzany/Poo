package guanabara_poo;

public class Tecnico extends Professor{
  private int registroProfissional;
  
  public void praticar(){
      System.out.println(this.getNome()+" Praticando");  
  }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
  
}
