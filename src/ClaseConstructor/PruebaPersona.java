
package ClaseConstructor;

public class PruebaPersona {

  
    public static void main(String[] args) {
        Persona camilo= new Persona();
        Persona ricardo= new Persona(33456789);
        Persona clara=new Persona(36789412, "Clara");
        Persona rita=new Persona(14756895, "Rita","Perez");
        
        camilo.mostrar();
        ricardo.mostrar();
        clara.mostrar();
        rita.mostrar();
        
                
    
    
}
}