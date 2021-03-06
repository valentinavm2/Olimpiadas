package olimpiadas;

import java.util.Date;


//Este es un comentario 
//buenas noches
//hola
//valentina Valencia


public class Olimpiadas {

    String juego; //tipo de juego
    private int numeroDeJugadores; //cantidad de participantes de ese juego
    private Date fechaDelJuego; //fecha en que se realizara el juego
    private String habilidad; // habilidad destacada en el juego
    private Boolean internacional; //true si son participantes de distintos paises o false si son de un solo pais
    
    //atributos de composicion
    private Persona jugador = null;
    private Premio premioFinal;
    
    public Olimpiadas(
            String juego, 
            int numeroDeJugadores, 
            Date fechaDelJuego, 
            String habilidad, 
            Boolean internacional) {
        this.juego = juego;
        this.numeroDeJugadores = numeroDeJugadores;
        this.fechaDelJuego = fechaDelJuego;
        this.habilidad = habilidad;
        this.internacional = internacional;
        this.premioFinal = new Premio(586,"medalla");
    }
    //hola 
    public Persona getJugador(){
        return this.jugador;
     }//hola
    //hola
    
    public void setJugador(Persona n){
        this.jugador = n;
    }
    //el metodo aumenta la cantidad de jugadores de las ollimpiadas 30
    //y la convierte en internacional
    public void aumentarJugadores(){
       this.numeroDeJugadores +=30;
       this.internacional = true;
    }
    
    //el metodo permite cambia el juego
    //y cambiar la habilidad
    //ademas la convierte en internacional
    public void modificacion(
            String nuevoJuego,
            String nuevaHabilidad){
       this.juego = nuevoJuego;
       this.habilidad = nuevaHabilidad;
       this.internacional = true;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public int getNumeroDeJugadores() {
        return numeroDeJugadores;
    }

    public void setNumeroDeJugadores(int numeroDeJugadores) {
        this.numeroDeJugadores = numeroDeJugadores;
    }

    public Date getFechaDelJuego() {
        return fechaDelJuego;
    }

    public void setFechaDelJuego(Date fechaDelJuego) {
        this.fechaDelJuego = fechaDelJuego;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public Boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(Boolean internacional) {
        this.internacional = internacional;
    }
    
    
    public static void main(String[] args) {
        Olimpiadas olimpiadasUno = new Olimpiadas(
                "Natacion",
                10,
                new Date(),"Locomocion",
                false);
        Olimpiadas olimpiadasDos = new Olimpiadas(
                "Baloncesto",
                20,
                new Date(),"coordinacion",
                true);
        
        System.out.println(olimpiadasUno.getJuego());
        System.out.println(olimpiadasUno.getNumeroDeJugadores());
        System.out.println(olimpiadasUno.getInternacional());
        
        
        olimpiadasUno.aumentarJugadores();
        
        System.out.println(olimpiadasUno.getJuego());
        System.out.println(olimpiadasUno.getNumeroDeJugadores());
        System.out.println(olimpiadasUno.getInternacional());
        
    }
    
}
