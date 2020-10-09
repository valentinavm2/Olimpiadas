package olimpiadas;

import java.util.Date;


public class JuegosOlimpicosDeInvierno extends Olimpiadas{
    
    private String pais;
    private int numeroDeJuegos;
    private Boolean limiteDeEdad;

    public JuegosOlimpicosDeInvierno(String juego,
            int numeroDeJugadores,
            Date fechaDelJuego,
            String habilidad,
            Boolean internacional,
            String pais,
            int numeroDeJuegos,
            Boolean limiteDeEdad) {
        super(juego, numeroDeJugadores, fechaDelJuego, habilidad, internacional);
        this.pais = pais;
        this.numeroDeJuegos = numeroDeJuegos;
        this.limiteDeEdad = limiteDeEdad;
        
        
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumeroDeJuegos() {
        return numeroDeJuegos;
    }

    public void setNumeroDeJuegos(int numeroDeJuegos) {
        this.numeroDeJuegos = numeroDeJuegos;
    }

    public Boolean getLimiteDeEdad() {
        return limiteDeEdad;
    }

    public void setLimiteDeEdad(Boolean limiteDeEdad) {
        this.limiteDeEdad = limiteDeEdad;
    }
     
    public void aumentarJuegos(){
       this.numeroDeJuegos +=5;
       this.limiteDeEdad = false;
       System.out.println("el numero de juegos actual de los juegosOlimpicosDeInvierno es:" +String.valueOf(this.numeroDeJuegos)+ " juegos y el limite de edad es:" + String.valueOf(this.limiteDeEdad));
    }
    
    public void modificarPais(
            String nuevoPais){
       this.pais = nuevoPais;
       this.limiteDeEdad = false;
    
    }

    public static void main (String[] args) {
        JuegosOlimpicosDeInvierno juegosOlimpicosDeInviernoPublico = new JuegosOlimpicosDeInvierno(
                "Natacion",
                 10,
                 new Date(),
                 "Locomocion",
                 false,
                 "Estados Unidos",  
                 8, 
                 true);
       juegosOlimpicosDeInviernoPublico.aumentarJugadores();
       juegosOlimpicosDeInviernoPublico.aumentarJuegos();
   
       
    }
 }
    
