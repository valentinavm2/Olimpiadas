
package olimpiadas;

public class Premio {
    private int peso;
    private String tipoDePremio;
    
    public Premio(int peso, String tipoDePremio){
        this.peso = peso; 
        this.tipoDePremio = tipoDePremio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipoDePremio() {
        return tipoDePremio;
    }

    public void setTipoDePremio(String tipoDePremio) {
        this.tipoDePremio = tipoDePremio;
    }
    
}
