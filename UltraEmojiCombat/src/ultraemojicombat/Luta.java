package UltraEmojiCombat;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado; // tipos abstratos de dados, provem de outras classes 
    private Lutador Desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos
    public void MarcarLuta(Lutador l1, Lutador l2){
     if(l1.getCategoria().equalsIgnoreCase(l2.getCategoria()) && l1 != l2){
         this.aprovada = true;
         this.desafiado = l1;
         this.Desafiante = l2;
     }else{
         this.aprovada = false;
         this.Desafiante = null;
         this.desafiado = null;
     }   
    }
    public void Lutar(){
        System.out.println("@@@@@@@@@_-FIGHT-_@@@@@@@@@@@@");
      if(this.aprovada){
          System.out.println("###DESAFIADO###");
          this.desafiado.apresentar();
          System.out.println("###DESAFIANTE###");
          this.Desafiante.apresentar();
          Random aleatorio = new Random();
          int vencedor = aleatorio.nextInt(3);
          switch(vencedor){
              case 0: //empate
                  System.out.println("Empatou!!!");
                  this.desafiado.empatarLuta();
                  this.Desafiante.empatarLuta();
                  break;
              case 1: //desafiado ganha
                  System.out.println("Vitória do "+ this.desafiado.getNome());
                  this.desafiado.ganharLuta();
                  this.Desafiante.perderLuta();
                
                  break;
              case 2: //desafiante ganha 
                  System.out.println("Vitória do "+ this.Desafiante.getNome());
                  this.Desafiante.ganharLuta();
                  this.desafiado.perderLuta();
                  break;
          }
      }  else{
          System.out.println("A luta não pode acontecer ");
      }
    }
    //METODOS ESPECIAIS 

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return Desafiante;
    }

    public void setDesafiante(Lutador Desafiante) {
        this.Desafiante = Desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }


}
