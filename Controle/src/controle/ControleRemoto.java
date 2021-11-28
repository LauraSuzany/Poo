package controle;

public class ControleRemoto implements InterfaceControle {
// atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
// construtor
// this é tudo que vai ser acesso pela outra classe
    public ControleRemoto(){
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
}
// get
    private int getVolume() {
        return volume;
    }
     private boolean getLigado() {
        return ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    
// set
    public void setVolume(int v) {
        this.volume = v;
    }
    public void setLigado(boolean l) {
        this.ligado = l;
    }
    public void setTocando(boolean t) {
        this.tocando = t;
    }

//metodos abstratos   

    @Override // sobre escrever diz que eu já tenho esse metodo porém estou reescrevendo
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("**********MENU************");
        System.out.println("Esta ligada ? "+ this.getLigado());
        System.out.println("Esta tocando? "+ this.getTocando());
        System.out.println("Vaolume: "+ this.getVolume());
        for(int i = 0; i<= this.getVolume();i+=10){
            System.out.print("|");         
        }
         System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisValome() {
        if(this.getLigado()){
         this.setVolume(getVolume()+5);
        }else{
            System.out.println("Impossível almentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume()-5);
        }else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    @Override
     public void play() {
         if(this.getLigado() && !(this.getTocando())){
             this.setTocando(true);
         }else{
            System.out.println("Não consegui reproduzir");
        }
    }
    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
            
        }else{
            System.out.println("Não consegui pausar");
        }
    }

    
   
    
    
}