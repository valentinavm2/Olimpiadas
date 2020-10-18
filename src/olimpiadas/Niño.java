
package olimpiadas;


public class Niño extends Persona {
    private String genero;
    private int edad; 
    private Boolean jugoAntes;
    
    public Niño(String nombre, String apellido, String genero, int edad, Boolean jugoAntes ){
      super(nombre, apellido);
      this.genero = genero;
      this.edad = edad; 
      this.jugoAntes = jugoAntes;
    }
}
