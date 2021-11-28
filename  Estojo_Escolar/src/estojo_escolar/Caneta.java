package estojo_escolar;

public class Caneta {

    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    private boolean destampar;
    private String estatus;

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Caneta(String m, String c, float p) {//metodo construtor;
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        /**
         * @return the modelo
         */
    
    }
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ponta
     */
    public float getPonta() {
        return ponta;
    }

    /**
     * @param ponta the ponta to set
     */
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    /**
     * @return the tampada
     */
    public boolean getTampada() {
        return tampada;
    }

    /**
     * @param tampada the tampada to set
     */
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    /**
     * @return the destampar
     */
    public boolean getDestampar() {
        return destampar;
    }

    /**
     * @param destampar the destampar to set
     */
    public void setDestampar(boolean destampar) {
        this.destampar = destampar;
    }

    @Override
    public String toString() {
        return "Caneta{" + "modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", tampada=" + tampada + ", destampar=" + destampar + '}';
    }

}

