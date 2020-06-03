package deporte;
import java.util.HashSet;
import java.util.Iterator;
public class Equipo {
    HashSet<Jugador> equipo = new HashSet<>();
    private String nombre;
    public Equipo(String nombre) {
        this.nombre=nombre;
    }
    public HashSet<Jugador> getEquipo() {
        return equipo;        
    }
    public void setEquipo(HashSet<Jugador> equipo) {        
        Iterator iter = equipo.iterator();
        while (iter.hasNext())
        {
           Jugador p=(Jugador) iter.next();        
           this.equipo.add(p);
        }   
    }
    public void mostrarEquipo(){
        System.out.println("Equipo:"+this.nombre);
        Iterator iter = equipo.iterator();
        while (iter.hasNext())
        {
            Jugador p=(Jugador) iter.next();        
            System.out.println(p.getNombre());       
        }
    }  

    public String getNombre() {
        return nombre;
    }
    
}
