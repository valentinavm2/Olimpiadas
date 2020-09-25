package olimpiadas;

import java.util.Date;

public class Olimpiadas {

    private String juego; //tipo de juego
    private int numeroDeJugadores; //cantidad de participantes de ese juego
    private Date fechaDelJuego; //fecha en que se realizara el juego
    private String habilidad; // habilidad destacada en el juego
    private Boolean internacional; //true si son participantes de distintos paises o false si son de un solo pais

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
    }
    //el metodo aumenta la cantidad de jugadores de las ollimpiadas 30
    //y la convierte en internacional
    public void aumentarJugadores(){
       this.numeroDeJugadores +=30;
       this.internacional = true;
    }
    
    //el metodo permite cambia el juego
    //y cambiar la habilidad
    public void modificacion(
            String nuevoJuego,
            String nuevaHabilidad){
       this.juego = nuevoJuego;
       this.habilidad = nuevaHabilidad;
       this.internacional = false;
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
        
    }
    
}